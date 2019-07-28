import java.util.Scanner;
class Main
{
  static int square(int n)
  {
    return n*n;
  }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      System.out.println(square(n));
	} 
}