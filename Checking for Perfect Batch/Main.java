import java.util.Scanner;
class Main
{
  public static void check(int list[])
  {
    int c=0;
    int sum=list[0]+list[1]+list[2];
    for(int i=3;i<list.length;i=i+3)
    {
      int csum=list[i]+list[i+1]+list[i+2];
      if(csum!=sum)
      {
        c++;
        break;
      }
    }
    if(c>0)
      System.out.println("Not a Perfect Batch");
    else
      System.out.println("Perfect Batch");
  }
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int list[]=new int[n];
    for(int i=0;i<n;i++)
      list[i]=s.nextInt();
    check(list);
  }
}