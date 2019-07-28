import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int num=s.nextInt();
      int sum=0,last=0,f=1;
      int temp=num;
      while(temp>0)
      {
        f=1;
        last=temp%10;
        temp=temp/10;
        for(int i=1;i<=last;i++)
        {
          f=f*i;
        }
        sum=sum+f;
      }
      if(sum==num)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}