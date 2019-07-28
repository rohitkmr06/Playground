
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        print(arr, n);
        for(int i = 0; i <n; i++){
            for(int j = n-1; j >=0; j--)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void print(int arr[][], int n)
    { 
        int val=1;
        int rmin=0,cmin=0;
        int rmax=n-1, cmax=n-1;
        while ((rmin<=rmax) && (cmin<=cmax))
        {
            for(int i=cmin;i<=cmax;i++)
            {
                arr[rmin][i] = val++;
            }
            for(int i=rmin+1;i<=rmax;i++)
            {
                arr[i][cmax] = val++;
            }
            for(int i=cmax-1;i>=cmin;i--)
            {
                arr[rmax][i] = val++;
            }
            for(int i=rmax-1;i>=(rmin+1);i--)
            {
                arr[i][cmin] = val++;
            }
            rmin++; 
            cmin++; 
            rmax--; 
            cmax--;
        }
    }
}