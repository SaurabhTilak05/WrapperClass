/*
 *  Problem Statement:
 Write a Java program that takes a string str and returns the number of unordered anagrammatic substring pairs. Two substrings are anagrams if they have the same characters in any order.
Example:
Input: str = "abba"
Output: 4  
Explanation: The anagram pairs are:  
("a", "a"), ("ab", "ba"), ("b", "b"), ("abb", "bba")
Constraints:
1 ≤ str.length ≤ 100
Explanation:
This problem requires you to:
Generate all substrings.
Group them by character frequency signature (sorted characters or frequency map).
Count how many pairs exist in each group using combinatorics (nC2).
It tests your ability to:
Handle efficient substring grouping
Use hash maps to track frequency patterns
Solve problems with combinatorial logic
 */
package Wrapper_Class_Codes;
import java.util.*;
public class NumberofUnsortedAnagramisticsubStr {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String");
		String str=s.nextLine();
		List<String>list=new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
		    for (int j = i + 1; j <= str.length(); j++) { 
		        list.add(str.substring(i, j)); 
		    }
		}
		
		list.forEach(System.out::println);
		System.out.println("\n\n Anagrams");
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++)
			{
				String a=list.get(i);
				String b=list.get(j);
				
				if(isAnagram(a, b)) {
					System.out.println(a+","+b);
				}
			}
		}
		
	}

	private static boolean isAnagram(String a, String b) {
		if(a.length()!=b.length()) {
			return false;
		}
		return getOcc(a).equals(getOcc(b));
	}

	private static Map<Character, Integer> getOcc(String str) {
		Map<Character, Integer> map=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			Character c=str.charAt(i);
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		return map;
	}

	private static String substring(String str, int i, int j) {
		char a[]=new char[j-i+1];
		int k=0;
		for(;i<j;i++) {
			a[k++]=str.charAt(i);
		}
		return new String (a);
	}

}
