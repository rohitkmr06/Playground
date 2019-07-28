import java.util.Scanner;
class Main
{
  public static void sort(int n, int arr[])
  {
    int m=n/2;
    for(int i=0;i<m-1;i++)
    {
      for(int j=0;j<m-1-i;j++)
      {
        if(arr[j]>arr[j+1])
        {
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
    for(int i=m;i<n;i++)
    {
      int key=arr[i];
      int j=i-1;
      while(j>=m && arr[j]<key)
      {
          arr[j+1]=arr[j];
          j--;
      }
      arr[j+1]=key;
    }
    
    for(int i=0;i<n;i++)
      System.out.print(arr[i]+" ");
  }
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=s.nextInt();
    sort(n,arr);
  }
}