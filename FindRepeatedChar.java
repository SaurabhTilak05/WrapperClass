/* Find the First Repeated Character in a String
Description: Find the first repeated character in a string.

*/
import java.util.*;
public class FindRepeatedChar
{
	public static void main(String x[])
	{
		Scanner s=new Scanner (System.in);
		System.out.println("Enter String ");
		String srt=s.nextLine();
		
		if(srt==null || srt.length()==0)
		{
			System.out.println("String is Empty");
			return;
		}
		for(int i=0;i<srt.length();i++)
		{
			char ch=srt.charAt(i);
			
			for(int j=i+1;j<srt.length();j++)
			{
				if(srt.charAt(j)==ch)
				{
					System.out.println("First Repeated character is:"+ch);
					return;
				}
			}

		}
	}
}