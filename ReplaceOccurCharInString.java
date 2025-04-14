/*
25. Replace All Occurrences of a Character in String
Description: Replace all occurrences of a character in a string with another character.
Input: "hello", o -> x
Output: "hellx"
*/

import java.util.*;
public class ReplaceOccurCharInString
{
	public static String replaceChar(String srt, char rep,char repChar)
	{
		char ch[]=new char[srt.length()];
		for(int i=0;i<srt.length();i++)
		{
			char chars=srt.charAt(i);
			if(chars == rep)
			{
				ch[i]=repChar;
			}
			else{
				ch[i]=chars;
			}
		}
		return new String(ch);
	}
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String");
		String srt=s.nextLine();
		
		
		System.out.println("Enter to replace character");
		char c=s.next().charAt(0);
		
		System.out.println("Enter replacement  Character");
		char re=s.next().charAt(0);
		
		
		String result=replaceChar(srt,c,re);
		System.out.println(result);
	}
	
	
}