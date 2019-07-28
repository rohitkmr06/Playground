import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner s=new Scanner(System.in);
      int mark=s.nextInt();
      if(mark>=85)
        System.out.println("A");
      else if(mark>=75)
        System.out.println("B");
      else if(mark>=65)
        System.out.println("C");
      else if(mark>=55)
        System.out.println("D");
      else if(mark>=45)
        System.out.println("E");
      else if(mark<45)
        System.out.println("Fail");
    }
}