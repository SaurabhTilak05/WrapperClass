/*
 *  Check for Palindrome Ignoring Case and Spaces Using StringBuffer
	Problem:
	Check whether a given string is a palindrome by ignoring case and whitespace.
	Use StringBuffer to reverse the string.
	Example:
	Input: "A man a plan a canal Panama"
	Output: Palindrome
 */

package Wrapper_Class_Codes;
import java.util.*;
public class CheckStringPalindromeornot {
	public static boolean isPalim(String srt)
	{
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<srt.length();i++)
		{
			char ch=srt.charAt(i);
			if(Character.isLetterOrDigit(ch))
			{
				sb.append(Character.toLowerCase(ch));
			}
		}
		StringBuffer rev=new StringBuffer();
		for(int i=sb.length()-1;i>=0;i--)
		{
			rev.append(sb.charAt(i));
		}
		return sb.toString().equals(rev.toString());
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Sentence");
		String srt=s.nextLine();
		System.out.println(isPalim(srt)? "Palimdrom" : "Not Palimdrome");
	}

}
