import java.util.Scanner;
class Main{
    static void prime(int n)
    {
      int count,j;
      for(int i=2;i<=n;i++)
      {
        count=1;
        for(j=2;j<=i/2;j++)
        {
          if(i%j==0)
          {
            count=0;
            break;
          }
        }
        if(count==1)
          System.out.println(i);
      }
    }
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      prime(n);
	}
}