import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner s=new Scanner(System.in);
      String str1=s.nextLine();
      String str2=s.nextLine();
      int no=s.nextInt();
      String[] arr=str2.split(" ");
      for(int i=0;i<arr.length;i++)
      {
        if(no==i)
          break;
        else
        {
          System.out.println(arr[i]);
        }
      }
    }
}