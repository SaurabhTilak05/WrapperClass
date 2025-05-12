/*
 * . Without using any loop constructs, reverse a string using StringBuilder or StringBuffer.
 */


package Wrapper_Class_Codes;
import java.util.*;
public class ReverseStringWihoutLoopConst
{
	 public static void main(String x[])
	 {
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter String ");
		 String str=s.nextLine();
		 StringBuffer sb=new StringBuffer(str);
		 sb.reverse();
		 System.out.println(sb);
	 }
}