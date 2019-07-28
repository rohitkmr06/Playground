import java.util.Scanner;
public class Main
{
  static int gcd(int a, int b)
  {
    int r=0;
    if(a<b)
      r=a;
    else
      r=b;
    while(r>0)
    {
      if(a%r==0 && b%r==0)
      {
        break;
      }
       r--; 
    }
    return r;
  }
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n1=s.nextInt();
      int n2=s.nextInt();
      int n3=s.nextInt();
      int result=gcd(n1,n2);
      System.out.println(gcd(result,n3));
	}
}