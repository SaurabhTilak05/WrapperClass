/*
 * 5. Compress a String Using Run-Length Encoding with StringBuilder

Problem:
Implement run-length encoding using StringBuilder. For example, the string "aaabbcddd" should be converted to "a3b2c1d3".
Example:
Input: "aaabbcddd"
Output: "a3b2c1d3"
 */

package Wrapper_Class_Codes;
import java.util.*;
public class StringRunLength {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String ");
		String str=s.nextLine();
		StringBuilder sb=new StringBuilder();
		boolean b[]=new boolean[str.length()];
		
		for(int i=0;i<str.length();i++)
		{
			int count=1;
			if(b[i]==false)
			{
				for(int j=i+1;j<str.length();j++)
				{
					if(str.charAt(i)==str.charAt(j))
					{
						b[j]=true;
						count++;
					}
				}
				sb.append(str.charAt(i)).append(count);
			}
		}
		 System.out.println(sb.toString());
	}

}
