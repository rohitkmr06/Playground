import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int sum=sum(n);
      System.out.println(sum);
    }
  public static int sum(int n)
  {
    if(n==0)
      return 0;
    else if(n==1)
      return 1;
    else
      return (n+sum(n-1));
  }
}