import java.util.*;
public class Main<T> 
{
     private T t;
     public void set(T t) 
     {
     	this.t = t;
     }
     public T get() 
     {
     	return t;
     }
     public static void main(String[] args) 
     {   
         Scanner s = new Scanner(System.in);   
         Main<Integer> in = new Main<Integer>();
         int num = s.nextInt();
         in.set(num);
         Main<String> str = new Main<String>();
         String str1 = s.next();
         str.set(str1);
         Main<Float>  fl = new Main<Float>();
         float f = s.nextFloat();
         fl.set(f);
         System.out.println("Integer Value: " + in.get());
         System.out.println("String Value: " + str.get());
         System.out.println("Float value: " + fl.get());
    }
}