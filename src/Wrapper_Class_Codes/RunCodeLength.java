/*Problem Statement:
 You’re given a run-length encoded string where characters are followed 
 by a positive number indicating the count (which could be more than one digit). Decode the string.
Example:
Input: "a12b3"
Output: "aaaaaaaaaaaabbb"
Input: "x1y10z2"
Output: "xyyyyyyyyyyz"
Explanation:
This requires:
Parsing strings with multi-digit integers
Handling character-to-number decoding
It tests:
Mastery of parsing logic
Dealing with variable-length numbers between letters
Careful character-by-character iteration
 */
package Wrapper_Class_Codes;
import java.util.*;
public class RunCodeLength {
	public static String decode(String str) {
		StringBuilder sb=new StringBuilder();
		int i=0;
		while(i<str.length())
		{
			char ch=str.charAt(i);
			i++;
			
			StringBuilder sbs=new StringBuilder();
			while(i<str.length() &&Character.isDigit(str.charAt(i))) {
				sbs.append(str.charAt(i));
				i++;
			}
			int count=Integer.parseInt(sbs.toString());
			for(int j=0;j<count;j++)
			{
				sb.append(ch);
				
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String");
		String str=s.nextLine();
		String result=decode(str);
		System.out.println(result);
	}
}
