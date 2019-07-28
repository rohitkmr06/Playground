import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      	String month=br.readLine();
      	String check=br.readLine();
      	String arr[]=month.split(",");
      	List<String> list=new ArrayList<String>();
      	for(int i=0;i<arr.length;i++)
        {
          list.add(arr[i]);
        }
      	System.out.println(list);
      	System.out.println("Size of the linked list: "+list.size());
      	System.out.println("Is LinkedList empty? "+list.isEmpty());
      	System.out.println("Does LinkedList contains "+check+"?");
      	System.out.println(list.contains(check));
    }
}