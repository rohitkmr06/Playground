import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int first=n%10;
    int middle=(n/10)%10;
    int last=n/100;
    int reverse=(first*100)+(middle*10)+last;
    System.out.println(reverse);
  }
}