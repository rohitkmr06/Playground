import java.util.Scanner;
class Main
{
  public static int power(int b, int e)
  {
    int num=1;
    for(int i=0;i<e;i++)
    {
      num=num*b;
    }
    return num;
  }
    public static void main(String args[])
    {
        //Try your logic here
      Scanner s=new Scanner(System.in);
      int base=s.nextInt();
      int exponent=s.nextInt();
      System.out.println(power(base,exponent));
    }
}