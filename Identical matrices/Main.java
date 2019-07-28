import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int r=s.nextInt();
    int c=s.nextInt();
    int arr1[][]=new int[r][c];
    int arr2[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        arr1[i][j]=s.nextInt();
      }
    }
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        arr2[i][j]=s.nextInt();
      }
    }
    int count=0,n=0;
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        if(arr1[i][j]==arr2[i][j])
          count++;
        else
        {
          n++;
          break;
        }
      }
      if(n>0)
        break;
    }
    if(count==(r*c))
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}