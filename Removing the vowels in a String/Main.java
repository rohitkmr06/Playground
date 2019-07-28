import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    StringBuilder sb=new StringBuilder(str);
    StringBuilder temp=new StringBuilder("");
    for(int i=0;i<str.length();i++)
    {
      if(sb.charAt(i)!='a'&&sb.charAt(i)!='e'&&sb.charAt(i)!='i'&&sb.charAt(i)!='o'&&sb.charAt(i)!='u')
      {
        temp.append(sb.charAt(i));
      }
    }
    System.out.println(temp);
  }
}