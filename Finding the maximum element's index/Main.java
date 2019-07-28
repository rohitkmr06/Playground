import java.util.Scanner;
class Main
{
  static int index(int arr[],int n)
  {
    int l=arr[0];
    int in=0;
    for(int i=0;i<n;i++)
    {
      if(l<arr[i])
      {
        l=arr[i];
        in = i;
      }
    }
    return in;
  }
  public static void main(String args[])
  {
    //Try your code here
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=s.nextInt();
    System.out.println(index(arr,n));
  }
}