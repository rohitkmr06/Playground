import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int num;
      for(int i=n;i>0;i--)
      {
        num=i;
        for(int j=1;j<=i;j++)
        {
          System.out.print(num);
          num--;
        }
        System.out.println();
      }
	}
}