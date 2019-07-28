import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
        String str=s.next();
        int l=str.length();
        int a=0;
        if(l%2==0)
        {
            a=(l/2)-1;
        }
        else
        {
            a=l/2;
        }
        StringBuilder sb=new StringBuilder("");
        for(int i=a;i<l;i++)
            sb.append(str.charAt(i));
        for(int i=0;i<a;i++)
            sb.append(str.charAt(i));
        for(int i=1;i<=l;i++)
        {
            for(int j=1;j<=l-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<i;k++)
            {
                    System.out.print(sb.charAt(k));
            }
            System.out.println();
        }
  }
}