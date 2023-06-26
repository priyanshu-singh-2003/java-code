
interface Super{
  public void method();
}
class Sub implements Super{
  public void method() {
      System.out.println("sub");
  }
}
class Priyanshu{
  public static void main(String args[]) {
      Super a = new Sub();
      a.method();
  }
}