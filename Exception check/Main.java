import java.util.Scanner;
import java.util.InputMismatchException;
public class Main
{
   public static void main(String args[])
   {
      try
      {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(n);
      }
      catch(Exception e)
      {
        System.out.println("Input Mismatch Exception occurred");
      }
   }
}