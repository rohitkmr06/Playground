import java.util.Scanner;
class Main
{
  static int power(int b, int e)
  {
    int num=b;
    for(int i=1;i<e;i++)
      num=num*b;
    return num;
  }
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int b=s.nextInt();
    int e=s.nextInt();
    System.out.println(power(b,e));
  }
}