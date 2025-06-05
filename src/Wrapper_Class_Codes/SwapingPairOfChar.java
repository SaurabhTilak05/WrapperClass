/*
  	Java String Program to Swapping Pair of Characters
	Input: str = “GIRITECHHUB”
	Output: IGIRETHCUHB
 */



package Wrapper_Class_Codes;

import java.util.Scanner;
public class SwapingPairOfChar {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String ");
		String str=s.nextLine();
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length-1;i=i+2)
		{
			char temp= ch[i];
			ch[i]=ch[i+1];
			ch[i+1]=temp;
		}
		String st=new String (ch);
		System.out.println(ch);
	}

}
