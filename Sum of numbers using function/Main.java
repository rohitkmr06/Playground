import java.util.Scanner;
class Main{
  static int sum(int n)
  {
    int sum=0;
    for(int i=1;i<=n;i++)
      sum=sum+i;
    return sum;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      System.out.println(sum(n));
	}
}