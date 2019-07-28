import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    int key=s.nextInt();
    StringBuilder sb=new StringBuilder("");
    for(int i=0;i<str.length();i++)
    {
      if(str.charAt(i)>='a' && str.charAt(i)<='z')
      {
        char ch=str.charAt(i);
        ch=(char)(ch-key);
        if(ch<'a')
        {
          ch=(char)(ch+26);
        }
        sb.append(ch);
      }
      else if(str.charAt(i)>='A' && str.charAt(i)<='Z')
      {
        char ch=str.charAt(i);
        ch=(char)(ch-key);
        if(ch<'A')
        {
          ch=(char)(ch+26);
        }
        sb.append(ch);
      }
      else
      {
        sb.append(' ');
      }
    }
    System.out.println(sb);
  }
}