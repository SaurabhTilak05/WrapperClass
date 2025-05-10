/*
 Convert a primitive int value to an Integer object and then convert it back to a primitive. Print all values.

 */

package Wrapper_Class_Codes;
import java.util.*;
public class ConvertPrimitivToInteger {
	
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value:  ");
		int a=s.nextInt();
		Integer b=Integer.valueOf(a);
		System.out.println("Convert Integer: "+b);
	}
}
