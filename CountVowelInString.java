/*20. Count Vowels in String
Description: Count the number of vowels in a given string.
Input: "hello"
Output: 2
*/
import java.util.*;
public class CountVowelInString
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String");
		String srt=s.nextLine();
		int count=0;
		
		for(int i=0;i<srt.length();i++)
		{
			if(srt.charAt(i)=='a'||srt.charAt(i)=='e'||srt.charAt(i)=='i'||srt.charAt(i)=='o'||srt.charAt(i)=='u'||srt.charAt(i)=='A'||srt.charAt(i)=='E'||srt.charAt(i)=='I'||srt.charAt(i)=='O'||srt.charAt(i)=='U'){
				count++;
			}
		}
		System.out.println("The Vowels count is:"+count);
		
	}
}