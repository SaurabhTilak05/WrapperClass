/*
 * Q1. Given a string s and a dictionary of strings wordDict, add spaces in s to construct a sentence where each word is a valid dictionary word. Return all such possible sentences in any order.
Note that the same word in the dictionary may be reused multiple times in the segmentation.
 
Example 1:
Input: s = "catsanddog", wordDict = ["cat","cats","and","sand","dog"]
Output: ["cats and dog","cat sand dog"]

Example 2:
Input: s = "pineapplepenapple", wordDict = ["apple","pen","applepen","pine","pineapple"]
Output: ["pine apple pen apple","pineapple pen apple","pine applepen apple"]
Explanation: Note that you are allowed to reuse a dictionary word.

Example 3:
Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
Output: []

 
Constraints:
	1 <= s.length <= 20
	1 <= wordDict.length <= 1000
	1 <= wordDict[i].length <= 10
	s and wordDict[i] consist of only lowercase English letters.
	All the strings of wordDict are unique.
	Input is generated in a way that the length of the answer doesn't exceed 105.

 */

package Wrapper_Class_Codes;
import java.util.*;
public class StringMatching {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String str=sc.nextLine();
		String wordDict[]=new String[5];
		System.out.println("Enter string in Array");
		for(int i=0;i<wordDict.length;i++)
		{
			wordDict[i]=sc.nextLine();
		}
		
		ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i < wordDict.length; i++) 
        {
            al.add(wordDict[i]);
        }
        
        
        List<String> result = new ArrayList<>();
        backtrack(str, al, 0, "", result);

        if (result.isEmpty()) {
            System.out.println("[]");
        } else {
            for (String sentence : result) {
                System.out.println(sentence);
            }
        }
    }
    public static void backtrack(String s, List<String> wordDict, int start, String currentSentence, List<String> result) {
        if (start == s.length()) {
            result.add(currentSentence.trim()); // remove leading space
            return;
        }

        for (int end = start + 1; end <= s.length(); end++) {
            String word = s.substring(start, end);
            if (wordDict.contains(word)) {
                backtrack(s, wordDict, end, currentSentence + " " + word, result);
            }
        }
    }
}




















