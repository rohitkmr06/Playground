import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int r=s.nextInt();
    int c=s.nextInt();
    int arr[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        arr[i][j]=s.nextInt();
      }
    }
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        if(i==j)
        {
          System.out.print(arr[i][j]+" ");
        }
        
      }
    }
    int a[]=new int[10];
    int ct=0;
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        if(j>i)
        {
          System.out.print(arr[i][j]+" ");
          a[ct]=arr[i][j];
          ct++;
          break;
        }
      }
    }
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        if(j>i && a[i]!=arr[i][j])
        {
          System.out.print(arr[i][j]+" ");
        }
      }
    }
  }
}