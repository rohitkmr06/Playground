import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      int b=s.nextInt();
      int c=s.nextInt();
      if(a>b)
      {
        if(a>c)
          System.out.println(a);
      }
      else if(b>c)
      {
        if(b>a)
          System.out.println(b);
      }
      else if(c>a)
      {
        if(c>b)
          System.out.println(c);
      }
    }
}