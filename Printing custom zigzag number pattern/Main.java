import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int num=1;
      int count=0;
      for(int i=1;i<=n;i++)
      {
        count=0;
        for(int j=1;j<=n;j++)
        {
          if(i%2==1)
          {
            if(j==n)
              System.out.print(++num);
            else
              System.out.print(num);
          }
          else
          {
            if(j==1)
            {
              System.out.print(++num);
              num--;
            }
            else
            {
              System.out.print(num);
              count++;
              if(count==(n-1))
                num++;
            }
          }
        }
        System.out.println();
      }
	}
}