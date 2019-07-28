import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner s=new Scanner(System.in);
      int ch=s.nextInt();
      switch(ch)
      {
        case 1:
          int side=s.nextInt();
          System.out.println(side*side);
          break;
        case 2:
          int length=s.nextInt();
          int breadth=s.nextInt();
          System.out.println(length*breadth);
          break;
        case 3:
          int base=s.nextInt();
          int height=s.nextInt();
          System.out.println(0.5*base*height);
          break;
        case 4:
          int radius=s.nextInt();
          System.out.println(3.14*radius*radius);
          break;
      }
    }
}