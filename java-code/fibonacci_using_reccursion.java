import java.util.*;
public class Priyanshu {
  public static int fibRecursion(int count) {
    if (count == 0) {
      return 0;
    }
    if (count == 1 || count == 2) {
      return 1;
    }
    return fibRecursion(count - 1) + fibRecursion(count - 2);
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int fib_len =sc.nextInt();
    System.out.print("Fibonacci Series of " + fib_len + " numbers is: \n");
    for (int i = 0; i < fib_len; i++) {
      System.out.print(fibRecursion(i) + " ");
    }
  }
}
