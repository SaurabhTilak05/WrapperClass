/*
 * Write a program that takes 3 strings (e.g., "100", "200", "300"), converts them to integers using 
 * Integer.parseInt(), and prints their sum.
 */

package Wrapper_Class_Codes;
import java.util.*;
public class ConvertStringToIntPrintSum {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter three Strings");
		String srt=s.nextLine();
		String srt1=s.nextLine();
		String srt2=s.nextLine();
		
		int a=Integer.parseInt(srt);
		int b=Integer.parseInt(srt1);
		int c=Integer.parseInt(srt2);
		
		int sum=a+b+c;
		 System.out.println("Sum is:  "+sum);
	}

}
