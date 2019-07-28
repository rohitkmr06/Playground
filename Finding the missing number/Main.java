import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
         arr[i]=s.nextInt();
      int c=1,count=0;
      boolean b=true;
      do
      {
        count=0;
      for(int i=0;i<n;i++)
      {
        if(arr[i]==c)
        {
          c++;
          count++;
          break;
        }
      }
        if(count==0)
          b=false;
      }while(b);
      System.out.println(c);
    }
}