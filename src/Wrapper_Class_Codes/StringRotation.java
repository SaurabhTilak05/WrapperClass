/*
Q4. Problem Statement:
 You are given two strings start and end consisting of only lowercase letters.
 You can do the following operation any number of times:
Pick any character in the string and move it to the end.
Determine if it is possible to transform start into end using this operation.
Example:
Input: start = "aab", end = "aba"
Output: YES
Input: start = "abc", end = "cab"
Output: YES
Input: start = "abc", end = "acb"
Output: NO
 */
package Wrapper_Class_Codes;
import java.util.*;
public class StringRotation {

	public static String transfer(String str, String end){
		int n=str.length();
		if(n!=end.length())
		{
			return "No";
		}
		for(int i=0;i<n;i++)
		{
			boolean b=true;
			for(int j=0;j<n;j++) {
				if(str.charAt((i+j)%n)!=end.charAt(j))
				{
					b=false;
					break;
				}	
			}
			if(b) {
				return "Yes";
			}
		}
		return "No";	
	}
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	 System.out.println("Enter Start String");
	 String str=s.nextLine();
	 System.out.println("Enter end strign");
	 String end=s.nextLine();
	 	
	 System.out.println(transfer(str, end));
	}
}
