import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=s.nextInt();
      }
      int a=s.nextInt();
      int b=s.nextInt();
      int ai=-1,bi=-1;
      for(int i=0;i<n;i++)
      {
        if(a==arr[i])
          ai=i;
        if(b==arr[i])
          bi=i;
      }
      System.out.println(ai);
      System.out.println(bi);
    }
}