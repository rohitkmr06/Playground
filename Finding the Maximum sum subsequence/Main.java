import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=s.nextInt();
    int num=0,sum=0;
    for(int i=0;i<n;i++)
    {
      if(num<arr[i])
      {
        sum=sum+arr[i];
        num=arr[i];
      }
      else
      {
        sum=0;
        sum=sum+arr[i];
        num=arr[i];
      }
    }
    System.out.println(sum);
  }
}