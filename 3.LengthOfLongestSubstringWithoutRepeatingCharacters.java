/*
Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

*/


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class LengthOfLongestSubstring {
	
	public int lengthOfLongestSubstring(String s){
	Set<Character> set=new HashSet<Character>();
	int i=0;
	int j=0;
	int val=0;
	int max=0;
	
	while(i<s.length() && j<s.length()){
		if(!set.contains(s.charAt(i))){
			set.add(s.charAt(i));
			val=Math.max(val, i-j);
			i++;
		}
		else{
			set.remove(s.charAt(j));
			j++;
			
		}
	}
	System.out.println(val+1);
	return val+1;
	
}
	
	public static void main(String[] args) {
		LengthOfLongestSubstring obj=new LengthOfLongestSubstring();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter String");
		obj.lengthOfLongestSubstring(input.nextLine());
		
	}
}
