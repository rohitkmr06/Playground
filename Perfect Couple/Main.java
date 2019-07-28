import java.util.Scanner;
class Main{
  static void print(int arr[], int n, int s)
  {
    for(int i=0;i<n;i++)
    {
      for(int j=i;j<n;j++)
      {
        if(arr[i]+arr[j]==s)
          System.out.println(arr[i]+", "+arr[j]);
      }
    }
  }
    public static void main(String args[]) {
      // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
        arr[i]=s.nextInt();
      int v=s.nextInt();
      print(arr,n,v);
    }
}