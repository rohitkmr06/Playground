import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int r=s.nextInt();
    int c=s.nextInt();
    int arr[][]=new int[r][c];
    int trans[][]=new int[c][r];
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
        trans[i][j]=arr[j][i];
      }
    }
    for(int i=0;i<c;i++)
    {
      for(int j=0;j<r;j++)
      {
        System.out.print(trans[i][j]+" ");
      }
      System.out.println();
    }
  }
}