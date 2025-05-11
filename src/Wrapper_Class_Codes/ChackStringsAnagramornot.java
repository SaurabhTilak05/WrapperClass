/*
 * Check if two strings are anagrams of each other using only StringBuilder methods (no arrays or HashMaps allowed).
 */

package Wrapper_Class_Codes;
import java.util.*;
public class ChackStringsAnagramornot {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first String ");
		String str=s.nextLine();
		System.out.println("Enter Second String ");
		String str1=s.nextLine();
		if(str.length()!=str1.length())
		{
			System.out.println("Not A Anagram String ");
			
		}
		else {
			boolean isAnagram=true;
			StringBuffer sb=new StringBuffer(str1);
			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				int ind=-1;
				for(int j=0;j<sb.length();j++)
				{
					if(sb.charAt(j)==ch)
					{
						ind=j;
						break;
					}
				}
				if(ind==-1)
				{
					isAnagram=false;
					break;
				}
				
			}
			if(isAnagram)
			{
				System.out.println("Anagram ");
			}
			else {
				System.out.println("Not Anagram");
			}
			
		}
		
	}

}
