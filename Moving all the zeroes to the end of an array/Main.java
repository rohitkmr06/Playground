import java.util.Scanner;
class Main{
  static void sep(int arr[], int n)
  {
    int temp=0,tval;
    for(int i=0;i<n;i++)
    {
      if(arr[i]==0)
      { 
        temp=i;
      }
        for(int j=temp;j<n;j++)
        {
          if(arr[j]!=0)
          {
            tval=arr[j];
            arr[j]=arr[i];
            arr[i]=tval;
            break;
          }
        }
    }
  }
    public static void main(String args[]) {
       // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=s.nextInt();
      }
      sep(arr,n);
      for(int i=0;i<n;i++)
      {
        System.out.print(arr[i]+" ");
      }
      
    }
}