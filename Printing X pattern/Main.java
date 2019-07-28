import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n%2==1)
        {
            n=n/2;
            n++;
        }
        else
        {
            n=n/2;
        }
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=i-1;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=((2*n-1)-2*(i-1));j++)
            {
                if(j==1||j==((2*n-1)-2*(i-1)))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++)
        {
            for(int k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<i*2;j++)
            {
                if(j==1||j==(i*2-1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
	}
}