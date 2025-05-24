package Wrapper_Class_Codes;
import java.util.*;
public class ExtractDigitAndSum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enert String ");//a1s2d3
		String str=s.nextLine();
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=48 && str.charAt(i)<=57) {
				sum=sum+(str.charAt(i)-48);
			}
		}
		System.out.println(sum);
	}
}
