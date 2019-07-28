import java.util.Scanner;
public class Main
{
    public static void main (String[] args) 
    {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int len=str.length();
        double a=0;
        double b=0;
        int c=0;
        for(int i=0;i<len;i++)
        {
            if(str.charAt(i)=='.')
            c=1;
        }
        if(c==1)
        {
            for(int i=len-1;str.charAt(i)!='.' && i>=0;i--)
            {
                a=a/10+(str.charAt(i)-'0');
            }
            a=a/10;
            for (int i=0;str.charAt(i)!='.';i++)
            {
                b=b*10+(str.charAt(i)-'0');
            }
        }
        else
        {
            for(int i=0;i<len;i++)
            {
                b=b*10+(str.charAt(i)-'0');
            }
        }
        double sum=(a+b);
        System.out.printf("%.6f",sum);
    }
}