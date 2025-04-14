/*Check if a String is Palindrome
Description: Check if the given string is a palindrome.
Input: "madam"
Output: Palindrome
*/
import java.util.*;
public class StringPalindrome
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String ");
		String srt=s.nextLine();
		String temp=srt;
		String st="";
		for(int i=0;i<srt.length();i++)
		{
			st=srt.charAt(i)+st;	
		}
		if(st.equals(temp))
		{
			System.out.println("String is Palindrome");
		}
		else{
			System.out.println("String is Not Palindrome");
		}
		
	}
}