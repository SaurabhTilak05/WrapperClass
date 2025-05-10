/*
 * Take a float number and convert it into a Float object. Print its int value using intValue() method.
 */

package Wrapper_Class_Codes;
import java.util.*;
public class ConvertFloatToFloatObject {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Eneter float Value");
		float val=s.nextFloat();
		Float obj=val; // auto boxing
		
		int intval=obj.intValue();//int value
		System.out.println("Integer values is"+intval);

	}

}
