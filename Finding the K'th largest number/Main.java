import java.util.Scanner;
class Main
{
  public static void sort(int arr[], int n)
  {
    for(int i=0;i<n-2;i++)
    {
      int min=min_idx(i,n-1,arr);
        swap(min,i,arr);
    }
  }
  public static int min_idx(int start, int end, int arr[])
  {
    int min=0;
    if(arr[start]<arr[start+1])
    {
      min=start;
    }
    else
    {
      min=start+1;
    }
    for(int i=start+2;i<=end;i++)
    {
      if(arr[i]<arr[min])
        min=i;
    }
    return min;
  }
  public static void swap(int min,int i,int arr[])
  {
    int temp=arr[min];
    arr[min]=arr[i];
    arr[i]=temp;
  }
    public static void main(String args[])
    {
      // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
        arr[i]=s.nextInt();
     
      sort(arr,n);
       int k=s.nextInt();
      k=n-k;
      for(int i=0;i<n;i++)
      {
        if(k==i)
        {
          System.out.println(arr[i]);
          break;
        }
      }
    }   
}