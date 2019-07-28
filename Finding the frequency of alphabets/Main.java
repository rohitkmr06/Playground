import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      int stat[]=new int[26];
      for(int i=0;i<26;i++)
        stat[i]=0;
      stat[0]=0;
      for(int i=0;i<str.length();i++)
      {
        if(str.charAt(i)>='a' && str.charAt(i)<='z')
        {
          int offset=str.charAt(i) - 'a';
          stat[offset]++;
        }
        else if(str.charAt(i)>='A' && str.charAt(i)<='Z')
        {
          int offset=str.charAt(i) - 'A';
          stat[offset]++;
        }
      }
      StringBuilder sb=new StringBuilder(str);
      for(int i=0;i<str.length();i++)
      {
        for(int j=i+1;j<str.length();j++)
        {
          if(sb.charAt(i)==sb.charAt(j))
          {
            sb.setCharAt(j,'$');
          }
        }
      }
      for(int i=0;i<str.length();i++)
      {
        int offset=0;
        if(sb.charAt(i)>='a' && sb.charAt(i)<='z')
        {
          offset=sb.charAt(i) - 'a';
        }
        else if(sb.charAt(i)>='A' && sb.charAt(i)<='Z')
        {
          offset=sb.charAt(i) - 'A';
          char ch=(char)(offset+'a');
          sb.setCharAt(i,ch);
        }
        if(sb.charAt(i)>='a' && sb.charAt(i)<='z')
        {
          System.out.print(sb.charAt(i));
          System.out.print(stat[offset]+" ");
        }
      }
    }
}