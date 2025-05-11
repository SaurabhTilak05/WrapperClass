/*
 * Take a numeric string input from the user (like "123.45"), convert it to a Double,
    multiply it by 2, and print the result.
 */

package Wrapper_Class_Codes;
import java.util.*;
public class ConvertStringToDoubleAndMul {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String like Double");
		String srt=s.nextLine();
		System.out.println("Enetr value to multiply");
		int mal=s.nextInt();
		Double val=Double.valueOf(srt);
		 System.out.println("double values is:  "+val);	
		 System.out.println("Multiplication is:  "+(val*mal));
	}

}
