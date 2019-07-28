import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int last=0;
      int num=n;
      int count=0,sum=0;
      while(num>0)
      {
        num=num/10;
        count++;
      }
      num=n;
      while(num>0)
      {
        last=num%10;
        sum = sum + (int)Math.pow(last,count);
        num=num/10;
      }
      if(n==sum)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}