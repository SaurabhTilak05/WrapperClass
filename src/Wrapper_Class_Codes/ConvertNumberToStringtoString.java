/*
 * Use the toString() method of a wrapper class to convert a number into a string and show that it's
    now a string by concatenating with another string.

 */


package Wrapper_Class_Codes;
import java.util.*;
public class ConvertNumberToStringtoString { 
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Integer Number");
		Integer num=s.nextInt();
		String srt=num.toString();
		String srt1=srt+"  concatiing string";
		 System.out.println("String is:  "+srt1);

	}

}
