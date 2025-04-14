/*23. Find the First Non-Repeated Character in a String
Description: Find the first non-repeated character in a string.
Input: "swiss"
Output: w
*/

import java.util.*;
public class FindFirstNonRepeatChar
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
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
			boolean isRepeated=false;
			for(int j=0;j<srt.length();j++)
			{
				if(i!=j && 	srt.charAt(j)==ch)
				{
					isRepeated=true;
					break;
				}	
			}
			if(!isRepeated)
			{
				System.out.println("the First Non-repeated Character is:"+ch);
				return ;
			}
		}
		
	}
}
