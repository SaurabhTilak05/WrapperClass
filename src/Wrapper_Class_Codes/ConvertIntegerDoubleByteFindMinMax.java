/*
 * Create a program to display the maximum and minimum values of Integer, Double, and Byte using their 
 	wrapper class constants.

 */

package Wrapper_Class_Codes;
import java.util.*;
public class ConvertIntegerDoubleByteFindMinMax {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Integer");
		System.out.println("Minimun value of Integer: "+Integer.MIN_VALUE);
		System.out.println("Maximun value of Integer: "+Integer.MAX_VALUE);
		System.out.println("Double");
		System.out.println("Minimun value of Double: "+Double.MIN_VALUE);
		System.out.println("Maximun value of Double: "+Double.MAX_VALUE);
		
		System.out.println("Byte");
		System.out.println("Minimun value of Byte: "+Byte.MIN_VALUE);
		System.out.println("Maximun value of Byte: "+Byte.MAX_VALUE);
	}

}
