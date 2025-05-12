/*
  Reverse Words in a Sentence Using StringBuilder
	Problem:
	Given a sentence, reverse each word in the sentence while maintaining the original word order.
	Example:
	Input: "Java is powerful"
	Output: "avaJ si lufrewop"
 */



package Wrapper_Class_Codes;
import java.util.*;
public class ReverseEveryWord {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enetr Sentence");
		String line=s.nextLine(); // Java is powerful
		
		String word[]=line.split(" ");
		StringBuffer sb=new StringBuffer();
		for(String wrd:word)
		{
			for(int i=(wrd.length()-1);i>=0;i--)
			{
				sb.append(wrd.charAt(i));
			}
			sb.append(" ");
		}
		line=sb.toString();
		System.out.println("String is:  "+line);
		
	}

}
