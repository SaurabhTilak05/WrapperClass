/*
 * Check if a given character is a whitespace or not using Character.isWhitespace() method.
 */

package Wrapper_Class_Codes;
import java.util.*;
public class CheckCharIsWhitespaceornot {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" Char is define ");
		char ch=' ';
		if(Character.isWhitespace(ch)) {
			System.out.println("White Space character");
		}
		else {
			System.out.println("Not WhiteSpace Character");
		}
	}

}
