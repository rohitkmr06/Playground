//import required packages
import java.util.Scanner;
class Faculty
{
  public void salary(int salary)
  {
    //write your Faculty class statements
    System.out.println("Base Salary: "+salary);
  }
}
class CSE
{
  public void salary(int salary)
  {
    //write your CSE class statements
    System.out.println("CSE Faculty: "+(salary+3000));
  }
}
class IT
{
  public void salary(int salary)
  {
    //write your IT class statements
    System.out.println("IT Faculty: "+(salary+5000));
  }
}
class ECE
{
  public void salary(int salary)
  {
    //write your ECE class statements
    System.out.println("ECE Faculty: "+(salary+4500));
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int salary=s.nextInt();
    Faculty f = new Faculty();
    f.salary(salary);
    CSE c = new CSE();
    c.salary(salary);
    IT i = new IT();
    i.salary(salary);
    ECE e = new ECE();
    e.salary(salary);
  }
}