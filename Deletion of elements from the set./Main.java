import java.io.*;
import java.lang.*;
import java.util.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
     	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      	String str=br.readLine();
      	TreeSet<Object> set=new TreeSet<Object>();
      	String arr[]=str.split(",");
      	for(int i=0;i<arr.length;i++)
        	set.add(arr[i]);
      	System.out.println(set);
      	for(int i=set.size()-1;i>=0;i--)
        {
          set.remove(set.last());
          System.out.println(set);
        }
      	
        
    }
}