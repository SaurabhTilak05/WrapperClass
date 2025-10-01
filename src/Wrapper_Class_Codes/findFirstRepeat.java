// find the first repeate character

import java.util.*;
public class findFirstRepeat{
	public static void main(String x[]){
	Scanner s=new Scanner(System.in);
		System.out.println("Enter String ");
		String str=s.nextLine();
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			boolean repeat=false;
			for(int j=0;j<ch.length;j++){
				if(i!=j && ch[i]==ch[j])
				{
					repeat=true;
					break;
				}
			}
			if(repeat){
				System.out.println("first repeat character is :   "+ch[i]);
				return;
			}
		}
	}
}