import java.util.*;
public class RemoveVowels
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enetr String ");
		String srt=s.nextLine();
		String st="";
		for(int i=0;i<srt.length();i++)
		{
			if(srt.charAt(i)!='a' && srt.charAt(i)!='e'&& srt.charAt(i)!='i'&& srt.charAt(i)!='o'&&srt.charAt(i)!='u'&&srt.charAt(i)!='A' && srt.charAt(i)!='E'&& srt.charAt(i)!='I'&& srt.charAt(i)!='O'&&srt.charAt(i)!='U')
			{
				st=st+srt.charAt(i);
			}
		}
		System.out.println(st);
	}
}








