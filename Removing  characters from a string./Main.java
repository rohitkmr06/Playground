import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    String str1=s.nextLine();
    StringBuilder sb=new StringBuilder(str);
    int sb_length=sb.length();
    for(int i=0;i<str1.length();i++)
    {
      for(int j=0;j<sb_length;j++)
      {
        if(str1.charAt(i)==sb.charAt(j))
        {
            sb.deleteCharAt(j);
            sb_length--;
        }
      }
    }
    System.out.println(sb);
  }
}