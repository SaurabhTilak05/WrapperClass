/*
 *  Insert a String in the Middle of Another String Using StringBuilder

Problem:
Write a program that takes two strings and inserts the second string into the middle of the first one using StringBuilder.
Example:
Input: first = "HelloWorld"
second = "Java"
Output: "HelloJavaWorld"
 */


package Wrapper_Class_Codes;
import java.util.*;
public class InsertStringInString {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String");
		String first=s.nextLine();
		System.out.println("Enter Inserting String");
		String second=s.nextLine();
		StringBuilder sb=new StringBuilder();
		int mid=first.length()/2;
		for(int i=0;i<first.length();i++)
		{
			sb.append(first.charAt(i));
			if (i == mid - 1 && first.length() % 2 == 0)
			{
				sb.append(second);
			}
			else if(i==mid -1 && first.length()%2!=0)
			{
				sb.append(second);
			}
		}
		System.out.println(sb.toString());
	}

}
