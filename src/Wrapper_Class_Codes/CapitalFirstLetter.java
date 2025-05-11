/*
 * Given a sentence, capitalize the first letter of each word using StringBuffer. 
 */

package Wrapper_Class_Codes;
import java.util.*;
public class CapitalFirstLetter {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String");
		String str=s.nextLine();
		StringBuffer sb=new StringBuffer(str); // Abv cft
		for(int i=0;i<sb.length();i++)
		{
			if(i==0||sb.charAt(i-1)== ' ')
			{
				
				sb.setCharAt(i,Character.toUpperCase(sb.charAt(i)));
				
			}
		}
		System.out.println("Result   "+sb.toString());
	}

}
