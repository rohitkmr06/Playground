import java.util.Scanner;
class Main{
  public static void main(String args[]) 
 {
   Scanner in = new Scanner(System.in);
   String string = in.nextLine();
   int ccount = in.nextInt();
   StringBuilder str = new StringBuilder(string); 
   int len = str.length();
   del_spaces(str, len);
   len = str.length();
   int rcount = len / ccount;
   if((len % ccount) > 0)
   {
       rcount++;
   }
   for(int c = 0; c < ccount; c++)
   {
       for(int r = 0; r < rcount; r++)
       {
           int ch = c + (r * ccount);
           if(r % 2 == 1)
           {
               int char_idx = (ccount - 1) + (r * ccount);
               ch = char_idx - c;
           }
           if(ch < len)
           {
               System.out.print(str.charAt(ch));
           }
           else
               System.out.print("X");
       }
    }
 }
 public static void del_spaces(StringBuilder str, int len)
 {
   StringBuilder temp = new StringBuilder("");
   for(int i = 0; i < len; i++)
   {
       if(str.charAt(i) != ' ')
       {
           temp.append(str.charAt(i));
       }
   }
   str.setLength(0);
   int temp_len = temp.length();
   for(int i = 0; i < temp_len; i++)
   {
       str.append(temp.charAt(i));     
   }
 }
}