/*
 * Take a String input from the user (like "123"), convert it into an int using a wrapper class method,
and add 10 to it. Print the result.
 */

package Wrapper_Class_Codes;
import java.util.*;
public class ConvertStringToInt {
	public static void main(String x[])
	 {
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enetr A String ");
		 String srt=s.nextLine();
		 int num=Integer.parseInt(srt);
		 System.out.println("int Number is:  "+num);
	 }
}
