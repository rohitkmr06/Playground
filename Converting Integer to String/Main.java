import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    StringBuilder sb=new StringBuilder("");
    int c=0;
    if(n<0)
    {
      n=n*(-1);
      c++;
    }
    while(n>0)
    {
      char ch=(char)(n%10 + '0');
      sb.append(ch);
      n=n/10;
    }
    sb.reverse();
    if(c==1)
      System.out.println("-"+sb);
    else
      System.out.println(sb);
  }
}


