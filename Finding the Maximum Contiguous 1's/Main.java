import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
        arr[i]=s.nextInt();
      int count[]=new int[n];
      int num=1;
      int k=0;
      for(int i=0;i<n-1;i++)
      {
        if(arr[i]==arr[i+1])
        {
          count[k]=num+1;
          num++;
          //num=arr[i];
        }
        else
        {
          k++;
          num=0;
          count[k]=num+1;
          num++;
          //num=arr[i];
        }
      }
      //System.out.println(k);
      int l=0;
        for(int i=0;i<k;i++)
        {
          if(l<count[i])
            l=count[i];
        }
      System.out.println(l);
    }
}