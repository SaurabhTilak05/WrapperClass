/* Check if Two Strings are Anagrams
Description: Check if two strings are anagrams of each other.
Input: "listen", "silent"
Output: Anagram
*/
import java.util.*;
public class TwoStringsAnagramOrNot
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first String ");
		String srt=s.nextLine();
		System.out.println("Enter second String ");
		String srt1=s.nextLine();
		
		char ch[]=srt.toCharArray();
		char c[]=srt1.toCharArray();
		if(ch.length != c.length)
		{
			System.out.println("Not Anagram String");
			return;
		}
		else{
				for(int i=0;i<ch.length;i++)
				{
					for(int j=i+1;j<ch.length;j++)
					{
						if(ch[i]>ch[j])
						{
							char temp=ch[i];
							ch[i]=ch[j];
							ch[j]=temp;
						}
					}
				}
				
				for(int i=0;i<c.length;i++)
				{
					for(int j=i+1;j<c.length;j++)
					{
						if(c[i]>c[j])
						{
							char temp=c[i];
							c[i]=c[j];
							c[j]=temp;
						}
					}
				}
			
				boolean flag=true;
				{
					for(int i=0;i<ch.length;i++)
					{	
						if(ch[i]!=c[i])
						{
							flag=false;
							break;
						}
					}
				
				}
				if(flag)
				{
					System.out.println("Anagram String");
				}
				else{
					System.out.println("Not Anagram String");
				}
		}
	}
}