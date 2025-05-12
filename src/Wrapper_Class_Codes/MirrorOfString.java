	/*
	 * Create a mirror of a string around its center using StringBuilder.
	Input: "race" → Output: "raceecar"
	 */
	
	
package Wrapper_Class_Codes;
import java.util.*;
public class MirrorOfString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String");
		String str=s.nextLine();
		String st="";
		StringBuffer sb=new StringBuffer(str);
		for(int i=0;i<sb.length();i++)
		{
			st=sb.charAt(i)+st;
		}
		System.out.println(str+st);
	}

}
