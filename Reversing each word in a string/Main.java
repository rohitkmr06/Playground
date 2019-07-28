import java.util.Scanner;
class Main
{
   public static void reverse(String str)
   {
	String[] w=str.split(" ");
	String rev="";
	for (int i=0;i<w.length;i++)
        {
           String word=w[i]; 
           String rw="";
           for (int j=word.length()-1;j>=0;j--) 
	        {
		    rw=rw+word.charAt(j);
	        }
	   rev=rev+rw+" ";
	}
	System.out.println(rev);
    }
   public static void main(String[] args) 
   {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        reverse(str);
   }
}