/*
    Using only StringBuilder, determine if a string is made by repeating a substring.

	Input: "abcabcabc" → Output: true (because "abc" is repeated)
*/

package Wrapper_Class_Codes;

import java.util.*;

public class RepatatingSubString {

	public static boolean getSubstrings(String s, int size) {
		String sub=s.substring( 0,size);
		for(int i=size;i+size-1<s.length();i+=size)
		{
			String part=s.substring(i, i+size);
			//System.out.println(part);
			if(!sub.equals(part))
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<s.length();i++)
		{
			if(s.length()%i==0)
			{
				//System.out.println("-------------------");
				if(getSubstrings(s, i)) {
					System.out.println("true");
					return;
				}
				
			}
		}
	}
}