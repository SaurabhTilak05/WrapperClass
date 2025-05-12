/*
  Remove Duplicate Characters from String Using StringBuffer
	Problem:
	Write a program to remove duplicate characters from a string using StringBuffer.
	Example:
	Input: "programming"
	Output: "progamin"
 */


package Wrapper_Class_Codes;
import java.util.*;
public class RemoveDuplicateCharacterInString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enetr String");
		String str=s.nextLine();
		StringBuffer sb=new StringBuffer();
		boolean b[]=new boolean[256];
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(!b[ch])
			{
				sb.append(ch);
				b[ch]=true;
			}
		}
		System.out.println("Result is:  "+sb.toString());
	}
}
