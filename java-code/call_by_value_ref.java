public class Priyanshu
{
 int data=50;  
  
 void change(int data){  
 data=data+100;//changes will be in the local variable only  
 }  
     
void change(Priyanshu op){  
 op.data=op.data+100;//changes will be in the instance variable  
 }  
 public static void main(String args[]){  
  Priyanshu op=new Priyanshu();  

   System.out.println("before change "+op.data);  
   op.change(500);  
   System.out.println("after change "+op.data);  
      System.out.println("before change "+op.data);  
   op.change(op);//passing object  
   System.out.println("after change "+op.data);
  
 }  
}