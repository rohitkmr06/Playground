import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a=n/100;
      int b=n%10;
      System.out.println(a+b);
	}
}