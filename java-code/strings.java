class Priyanshu
{
public
  static void main(String[] args)
  {
    String a = "Priyanshu";
    String b = "Singh";
    System.out.println(a.toLowerCase());
    System.out.println(b.toUpperCase());
    System.out.println(b.concat(a));
    System.out.println(b.length());
    String c = " kkkkk ";
    String d = "";
    System.out.println(c.trim());
    System.out.println(d.isEmpty());
    StringBuffer sb=new StringBuffer("techlearners");
    System.out.println("StringBuffer value "+sb); 
    int len=sb.length();
    System.out.println(len);
    int cap=sb.capacity();
    System.out.println(cap);
    char p=sb.charAt(4); 
    System.out.println(p);
    sb.append('n');
    System.out.println(sb);
    sb.append(" neeraj"); 
    System.out.println(sb);
    sb.deleteCharAt(10);
    System.out.println(sb);
  }
}
