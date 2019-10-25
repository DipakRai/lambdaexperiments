package mulshankar13.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DistinctSubstring {
	
	public static void main(String[] args) {
		                        
		String str = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(str));
	}
	
	public static int lengthOfLongestSubstring(String s) {
		
		Set<Character> charSet = new HashSet<Character>();
		int counter=0;
		int max =0;
		for(char c:s.toCharArray()) {
			while(charSet.contains(c)) {
				charSet.remove(s.charAt(counter++));
			}
			charSet.add(c);
			max = Math.max(max, charSet.size());
		}
		return max;
	}

}
