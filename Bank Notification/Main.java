import java.util.Scanner;
interface Notification
{
	void notificationBySms();
	void notificationByEmail();
	void notificationByCourier();
}
class Details implements Notification
{
	String name;
	public Details(String name)
	{
		this.name=name;
	}
	public void notificationBySms()
	{
		System.out.println(name+"-Notification by SMS");
	}
	public void notificationByEmail()
	{
		System.out.println(name+"-Notification by Mail");
	}
	public void notificationByCourier()
	{
		System.out.println(name+"-Notification by Courier");
	}
}
public class Main 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String bank=s.next();
		int type=s.nextInt();
		Details d=new Details(bank);
		if(type==1)
			d.notificationBySms();
		else if(type==2)
			d.notificationByEmail();
		else
			d.notificationByCourier();
	}
}
