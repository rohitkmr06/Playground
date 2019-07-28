import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
  	public static void insert(ArrayList<String> list,String str)
    {
      String arr[]=str.split(",");
      for(int i=0;i<arr.length;i++)
      {
        list.add(arr[i]);
      }
    }
  	public static void delete(ArrayList<String> list,int val)
    {
      list.remove(val);
    }
  	public static void display(ArrayList<String> list)
    {
        System.out.println(list);
    }
    public static void main(String a[])throws IOException
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      ArrayList<String> list=new ArrayList<String>();
      int count=0;
      while(true)
      {
        System.out.println("Choose any one:");
        System.out.println("1.Insert");
        System.out.println("2.delete");
        System.out.println("3.Display");
        System.out.println("4.Exit");
        int choice=Integer.parseInt(br.readLine());
        switch(choice)
        {
          case 1: String str=br.readLine();
            	  insert(list,str);
            	  break;
          case 2: int val=Integer.parseInt(br.readLine());
            	  System.out.println("Enter the index value to be deleted:"+val);
                  delete(list,val);
            	  break;
          case 3: display(list);
            	  break;
          case 4: count++;
            	  break;  
        }
        if(count==1)
          break;
      }
    }
}