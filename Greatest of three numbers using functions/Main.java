import java.util.Scanner;
class Main{
  static int greater(int a, int b)
  {
    if(a>b)
      return a;
    else
      return b;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n1=s.nextInt();
      int n2=s.nextInt();
      int n3=s.nextInt();
      int result=greater(n1,n2);
      System.out.println(greater(result,n3));
	}
}