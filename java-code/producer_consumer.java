// save as ProducerConsumerExample
import java.util.LinkedList;

public class ProducerConsumerExample {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(5); 
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
    }
}

class Buffer {
    private LinkedList<Integer> buffer;
    private int maxSize;

    public Buffer(int maxSize) {
        this.buffer = new LinkedList<>();
        this.maxSize = maxSize;
    }

    public synchronized void produce(int value) throws InterruptedException {
        while (buffer.size() == maxSize) {
            wait(); 
        }

        buffer.add(value);
        System.out.println("Produced: " + value);
        notifyAll();
    }

    public synchronized int consume() throws InterruptedException {
        while (buffer.size() == 0) {
            wait(); 
        }

        int value = buffer.removeFirst();
        System.out.println("Consumed: " + value);
        notifyAll(); 
        return value;
    }
}

class Producer implements Runnable {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 6; i++) {
                buffer.produce(i);
                Thread.sleep(1000); 
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer implements Runnable {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 6; i++) {
                int value = buffer.consume();
                Thread.sleep(2000); 
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}