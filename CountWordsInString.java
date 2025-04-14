/* Count Words in a String
Description: Count the number of words in a string.
Input: "hello world"
Output: 2
*/
import java.util.*;
public class CountWordsInString
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String ");
		String srt=s.nextLine();
		if(srt==null ||srt.isEmpty())
			{
				System.out.println("String is Empty");
				return;
			}
		int count=1;
		for(int i=0;i<srt.length();i++)
		{
			
			if(srt.charAt(i)==' ')
			{
				count++;
			}
		}
		System.out.println("the Number of word in String is:"+count);
	}
}