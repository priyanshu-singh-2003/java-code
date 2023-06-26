class Circle{
  int r;
  public Circle(){
    r=0;
  }
  public Circle(int x){
    r=x;
  }
  void display(){
    System.out.println("r is initialized by");
  }
}
public class Priyanshu{
  public static void main(String args[]) {
    Circle obj = new Circle();
    Circle obj1 = new Circle(4);
    obj1.display();
    obj2.display();
  }
}