import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      	Map<Object,Object> map=new LinkedHashMap<Object,Object>();
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
      	System.out.println("Size of map is : "+map.size());
    }
}