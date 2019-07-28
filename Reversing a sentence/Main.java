import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      StringBuilder sb=new StringBuilder(str);
      reverse_string(sb,0,str.length()-1);
      int start=0;
      for(int i=0;i<str.length();i++)
      {
        if(sb.charAt(i)== ' ')
        {
          reverse_string(sb,start,i-1);
          start=i+1;
        }
        else if(i==(str.length()-1))
        {
          reverse_string(sb,start,i);
          start=i+1;
        }
      }
      System.out.println(sb);
    }
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
      int start=start_idx;
      int end=end_idx;
      while(start<end)
      {
        char ch=sb.charAt(start);
        sb.setCharAt(start,sb.charAt(end));
        sb.setCharAt(end,ch);
        start++;
        end--;
      }
    }
}