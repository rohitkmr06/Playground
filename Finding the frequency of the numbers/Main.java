import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int k=s.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
        arr[i]=s.nextInt();
      int arr1[]=new int[k];
      for(int i=0;i<k;i++)
      {
        int count=0;
        for(int j=0;j<n;j++)
        {
          if((i+1)==arr[j])
            count++;
        }
        arr1[i]=count;
      }
      for(int i=0;i<k;i++)
      {
        System.out.println((i+1)+" "+arr1[i]);
      }
    }
}