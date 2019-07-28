import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       String str=br.readLine();
       Set<Object> set=new LinkedHashSet<Object>();
       String arr[]=str.split(",");
      for(int i=0;i<arr.length;i++)
        set.add(arr[i]);
      System.out.println(set);
      Object val=br.readLine();
      System.out.println("Enter the value to be deleted: "+val);
      set.remove(val);
      System.out.println(set);
      Object val1=br.readLine();
      System.out.println("Enter the value to be added: "+val1);
      set.add(val1);
      System.out.println(set);
    }
}