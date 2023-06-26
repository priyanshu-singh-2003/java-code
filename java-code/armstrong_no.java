import java.lang.*;
import java.util.*;
public class Priyanshu{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a 3 digit number");
    int a = sc.nextInt();
    int n = 0;
    int o = a;
    int p = 0;
    while(o!=0){
      p = o%10;
      n+=(p*p*p);
      o=o/10;
    }
    if(n==a){
      System.out.println("yes");
    }else{
      System.out.println("no");
    }
  }
}
//try 153