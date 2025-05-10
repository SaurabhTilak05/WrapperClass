/*
 * Demonstrate auto-boxing and auto-unboxing using any primitive type and its corresponding wrapper class.
 */

package Wrapper_Class_Codes;
import java.util.*;
public class AutoBoxingAutoUnboxing {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enetr int Value");
		int val=s.nextInt();
		Integer auto=val;// It is Auto Boxing 
		System.out.println("Perform Auto Boxing:  "+auto);
		
		System.out.println("Enter second Value to AutoUnboxing");
		Integer a=s.nextInt();
		int autounbox=a;
		System.out.println("Perform Auto Unboxing:  "+autounbox);
				
	}

}
