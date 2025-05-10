/*
   Check whether a given character is a digit or a letter using the Character wrapper class methods.
 */
package Wrapper_Class_Codes;
import java.util.*;
public class CheckletterOrDigit {

	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Character");
		String srt=s.nextLine();
		char ch=srt.charAt(0);
		if(Character.isLetter(ch))
		{
			System.out.println("is Letter");
		}
		else if(Character.isDigit(ch)){
			System.out.println("is DIgit ");
		}
		
	}
}
