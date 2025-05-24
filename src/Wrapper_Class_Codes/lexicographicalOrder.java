/*
Problem Statement:
Given a string str, remove duplicate letters so that every letter appears only once, and you must make
 the result the smallest in lexicographical order among all possible results.
Example:
Input: str = "cbacdcbc"
Output: "acdb"
Input: str = "bcabc"
Output: "abc"
 */

package Wrapper_Class_Codes;
import java.util.*;
public class lexicographicalOrder {

	public static String removeDuplicateLetters(String str) {
		Stack<Character> stack=new Stack<>();
		boolean vis[]=new boolean[26];
		int count[]=new int[26];
		
		for(char c:str.toCharArray()) {
			count[c-'a']++;
		}
		for(char c:str.toCharArray()) {
			count[c-'a']--;
			if(vis[c-'a'])
			{
				continue;
			}
			while(!stack.isEmpty() && c<stack.peek() && count[stack.peek()-'a']>0) {
				vis[stack.pop()-'a']=false;
			}
			stack.push(c);
			vis[c-'a']=true;
		}
		StringBuilder sb=new StringBuilder();
		while(!stack.isEmpty()) {
			sb.insert(0, stack.pop());
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String");
		String str=s.nextLine();
		String result=removeDuplicateLetters(str);
		System.out.println(result);
	}

}
