import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner s=new Scanner(System.in);
      String str=s.next();
      StringBuilder sb=new StringBuilder(str);
      int f=0,l=str.length()-1;
      boolean match=true;
      while(f<l)
      {
        if(sb.charAt(f)!=sb.charAt(l))
        {
          match=false;
          break;
        }
        f++;
        l--;
      }
      if(match==true)
        System.out.println("Yes");
      else
        System.out.println("No");
    } 
}