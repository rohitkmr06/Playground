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
    int f[]=new int[n];
    int count=0;
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(arr[i]==arr[j])
          count++;
      }
      f[i]=count;
    }
    int l=0;
    for(int i=0;i<n;i++)
    {
      if(l<f[i])
        l=i;
    }
    System.out.println(arr[l]);
  }
}