import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      StringBuilder sb=new StringBuilder(str);
      String replace=s.nextLine();
      String include=s.nextLine();
      System.out.println(str.replace(replace,include));
    }
}