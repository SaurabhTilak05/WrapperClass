/*
 * Rotate a string to the right by k positions using StringBuffer.
Input: "abcdef", k = 2 → Output: "efabcd"
 */

package Wrapper_Class_Codes;
import java.util.*;
public class RotateStringRightByKthPosition {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter a String");
		String str=s.nextLine();
		StringBuffer sb=new StringBuffer(str);
		System.out.println("Enter Kth rotation");
		int k=s.nextInt();
		while(k!=0)
		{
			char ch=sb.charAt(sb.length()-1);
			for(int i=sb.length()-1;i>0;i--)
			{
				sb.setCharAt(i, sb.charAt(i-1));
			}
			sb.setCharAt(0, ch);
			k--;
		}
		System.out.println(sb.toString());
	}

}
