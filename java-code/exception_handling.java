import java.lang.Exception;
class MyException extends Exception
{
  MyException(String message)
  {
    super(message);
  }
} 
class Priyanshu
{
  public static void main(String args[]) throws MyException
  {
    int x=5, y = 1000;
    try
    {
      float z = (float)x / (float)y;
      if (z < 0.01)
      {
        throw new MyException("Number is too small");
      }
    }
    catch (MyException e)
    {
      System.out.println("Caught my exception");
      System.out.println(e.getMessage());
    }
    finally
    {
      System.out.println("I am always here");
    }
  }
}