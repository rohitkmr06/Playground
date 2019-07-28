import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      	TreeMap<Object,Object> map=new TreeMap<Object,Object>();
      	int n=Integer.parseInt(br.readLine());
      	System.out.println("Enter the number of values to be inserted in map:"+n);
      	for(int i=0;i<n;i++)
        {
          Object ob=br.readLine();
          Object num=br.readLine();
          map.put(ob,num);
        }
      	System.out.println(map);
      	Object index=br.readLine();
      	System.out.println("Enter the index to be removed:"+index);
      	map.remove(index);
      	System.out.println(map);
      	Object ind=br.readLine();
      	System.out.println("Enter the index to insert:"+ind);
      	Object val=br.readLine();
      	System.out.println("Enter the value to be inserted:"+val);
      	map.put(ind,val);
      	System.out.println(map);
    }
}