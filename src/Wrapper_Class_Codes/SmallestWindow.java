/*
 *  Problem Statement:
Given two strings s and t, write a Java program to find the smallest window in s which contains all the characters of string t (including duplicates). If no such window exists, print "".
Example:
Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
Input: s = "a", t = "aa"
Output: ""
Constraints:
1 ≤ s.length, t.length ≤ 1000
Explanation:
This question checks:
Substring searching
Two pointer or sliding window
Use of frequency maps for character tracking
The goal is to efficiently slide through s, maintaining a valid window that contains all characters from t.

 */
package Wrapper_Class_Codes;
import java.util.*;
public class SmallestWindow {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String ");
		String str=s.nextLine();
		System.out.println("Enter Second String ");
		String sec=s.nextLine();
		
		String sub="";
		String small=null;
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<=str.length();j++){
				sub=str.substring(i, j);
				boolean b=true;
				for(int k=0;k<sec.length();k++)
				{
					char ch=sec.charAt(k);
					if(sub.indexOf(ch)==-1)
					{
						b=false;
						break;
					}
				}
				if(b) {
					if(small==null ||sub.length()<small.length()) {
						small=sub;
					}
				}
				
			}
		}
		System.out.println(small);
		

	}

}
