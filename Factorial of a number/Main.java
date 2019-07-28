import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner s=new Scanner(System.in);
      int num=s.nextInt();
      int f=1;
      for(int i=1;i<=num;i++)
      {
        f=f*i;
      }
      System.out.println(f);
	}
}