import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int f=factorial(n);
    System.out.println(f);
  }
  public static int factorial(int n)
  {
    if(n>=1)
      return n*factorial(n-1);
    else
      return 1;
  }
}