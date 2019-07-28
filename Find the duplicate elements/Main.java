import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      	String str=br.readLine();
      	TreeSet<Object> set=new TreeSet<Object>();
      	String arr[]=str.split(",");
      	System.out.println("Duplicate Entry is:");	
      	for(int i=0;i<arr.length;i++)
        {
          if(!set.add(arr[i]))
          {
            System.out.println(arr[i]);
          }
        }
      	System.out.println("TreeSet is : "+set);
    }
}