import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
        arr[i]=s.nextInt();
      int left=0,right=n-1;
      int c=0;
      while(left<right)
      {
        if(arr[left]==arr[right])
        {
          left++;
          right--;
        }
        else
        {
          System.out.println("No");
          c++;
          break;
        }
      }
      if(c==0)
        System.out.println("Yes");
    }
}