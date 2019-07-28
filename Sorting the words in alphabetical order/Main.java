import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String[] w=new String[n];
        for(int i=0;i<n;i++)
        {
            w[i]=s.next();
        }
        int k=0;
        for(int i=0;i<n;i++)  
        {
            int ch=w[i].charAt(0);
            if(ch>64 && ch<91)
            {
                String str=w[i];
                char[] chr=str.toCharArray();
                ch=ch+32;
                chr[0]=(char)ch;
                w[i]=new String(chr);
            }
        }
        for(int i=0;i<n-1;++i) 
        {
            for (int j=i+1;j<n;++j) 
            {
                if (w[i].charAt(k)>w[j].charAt(k)) 
                {
                    String temp=w[i];
                    w[i]=w[j];
                    w[j]=temp;
                    k=0;
                }
            }
        }
        for(int i=0;i<n;i++) 
        {
            System.out.println(w[i]);
        }
    }
}