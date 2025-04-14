/* Reverse a String
Description: Reverse the given string.
Input: "hello"
Output: "olleh"
*/
import java.util.*;
public class ReverseString 
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String ");
		String srt=s.nextLine();
		String st="";
		for(int i=0;i<srt.length();i++)
		{
			st=srt.charAt(i)+st;
		}
		System.out.println(st);
	}
}


/*
	
		char ch[]=srt.toCharArray();
		for(int i=0;i<srt.length()/2;i++)
		{
			char temp=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=temp;
		}
		String sr=new String(ch);
		System.out.println(sr);
	*/