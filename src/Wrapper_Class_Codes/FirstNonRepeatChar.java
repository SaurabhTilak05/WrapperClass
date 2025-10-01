/*Q8. Given a string, find the first non-repeated character using LinkedHashMap.
Input: "swiss" Output: 'w'
Hint: Track character counts and preserve insertion order using LinkedHashMap.
*/


import java.util.*;
public class FirstNonRepeatChar
{
     public static void main (String x[])
     {
          Scanner s=new Scanner(System.in);
          System.out.println("Enter character Array");
          char ch[]=new char[5];
            for(int i=0;i<ch.length;i++)
            {
                ch[i]=s.next().charAt(0);
            }
        
            for(int i=0;i<ch.length;i++)
            {
                boolean isRepeat=false;
                for(int j=0;j<ch.length;j++)
                {
                    if(i!=j && ch[i]==ch[j])
                    {
                        isRepeat=true;
                        break;         
                    }
                }
                if(!isRepeat)
                {
                    System.out.println("First non repeat element is: "+ch[i]);
                    break;
                }
            }

     }
}