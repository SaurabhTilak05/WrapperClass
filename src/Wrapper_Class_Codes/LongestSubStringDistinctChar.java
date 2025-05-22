package Wrapper_Class_Codes;
import java.util.*;
public class LongestSubStringDistinctChar {

	public static int lengthOfLengestSubString(String str, int k) {
		if(str==null || str.length()==0 || k==0) {
			return 0;
			}
		int left=0, maxLen=0;
		HashMap<Character, Integer> map=new HashMap<>();
		for(int i=0; i< str.length();i++) {
			char current=str.charAt(i);
			map.put(current, map.getOrDefault(current, 0)+1);
			while(map.size() >k) {
				char l=str.charAt(left);
				map.put(l, map.get(l)-1);
				if(map.get(l)==0) {
					map.remove(l);
				}
				left++;
			}
			maxLen=Math.max(maxLen, i-left+1);
		}
		return maxLen;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String ");
		String str=s.nextLine();
		System.out.println("Enter K Value");
		int k=s.nextInt();
		System.out.println("Length is:   "+lengthOfLengestSubString(str, k));
		
	
	}

}
