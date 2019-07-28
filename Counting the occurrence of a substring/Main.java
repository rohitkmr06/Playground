import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    String str1=s.next();
    int count=0;
    for(int i=0;i<(str.length()-str1.length()+1);i++)
    {
      boolean match=true;
      for(int j=0;j<str1.length();j++)
      {
        if(str.charAt(i+j)!=str1.charAt(j))
         {
           match=false;
         }
      }
      if(match==true)
      {
        count++;
      }
     }
    System.out.println(count);
    }
  } 
