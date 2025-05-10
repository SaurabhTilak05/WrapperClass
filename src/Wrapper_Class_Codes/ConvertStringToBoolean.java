/*
 * Given a string "true", convert it to a boolean using the Boolean wrapper class. Print the result and check if it's true.
 */

package Wrapper_Class_Codes;
import java.util.*;
public class ConvertStringToBoolean 
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String ");
		String srt=s.nextLine();
		
		Boolean b=Boolean.valueOf(srt);
		System.out.println("Boolean Object Value is: "+b);
		
			if(b){
				System.out.println("true");
			}
			else{
				System.out.println("false");
			}
	}
}
