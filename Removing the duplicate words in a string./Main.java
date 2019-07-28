import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    String st[]=str.split(" ");
    for(int i=0;i<st.length;i++)
    {
      if(st[i]!=null)
      {
        for(int j=i+1;j<st.length;j++)
        {
          if(st[i].equals(st[j]))
             st[j]=null;
        }
      }
    }
    for(int i=0;i<st.length;i++)
    {
      if(st[i]!=null)
        System.out.print(st[i]+" ");
    }
  }
}