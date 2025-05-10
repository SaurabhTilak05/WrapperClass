/*
 * Convert a double primitive value into a Double object using both autoboxing and the valueOf() method.

 */

package Wrapper_Class_Codes;
import java.util.*;
public class ConvertDoubleToPrimitive {

	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter double Value");
		double val=s.nextDouble();
		Double no=val;
		Double valofDouble=Double.valueOf(val);
		System.out.println("Autoboxing is : "+no);
		System.out.println("ValueOf is : "+valofDouble);
	}
}
