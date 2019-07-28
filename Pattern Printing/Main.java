import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner s=new Scanner(System.in);
      int r=s.nextInt();
      int c=s.nextInt();
      for(int i=r;i>0;i--)
      {
        for(int j=c;j>0;j--)
        {
          if(j<i)
            System.out.print(i);
          else
            System.out.print(j);
        }
        System.out.println();
      }
    }
}