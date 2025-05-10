/*
 * Convert a char to a Character object and check if it is an uppercase letter using the isUpperCase() method.
 */
package Wrapper_Class_Codes;
import java.util.*;
public class ConvertCharToCharacterCheckUppercase {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enetr char ");
		char ch=s.next().charAt(0);
		
		Character obj=ch; // auto boxing
		if(Character.isUpperCase(ch))
		{
			System.out.println("Upper Case Character");
		}
		else {
			System.out.println("Lower case Character");
		}
		
	}

}
