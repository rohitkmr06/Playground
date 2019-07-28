import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	Scanner s=new Scanner(System.in);
      String str1=s.next();
      String str2=s.next();
      String temp=str1.concat(str1);
      if(temp.contains(str2))
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}