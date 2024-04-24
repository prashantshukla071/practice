package Java_Brushup;

import java.util.HashMap;
import java.util.Map;

public class Longestsubstring {
	
	    public static String longestSubstringWithoutRepeating(String s) {
	        if (s == null || s.length() == 0) return "";

	        Map<Character, Integer> map = new HashMap<>();
	        int maxLen = 0;
	        int start = 0;
	        int end = 0;

	        for (int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);
	            if (map.containsKey(c)) {
	                start = Math.max(start, map.get(c) + 1);
	            }
	            map.put(c, i);
	            if (i - start + 1 > maxLen) {
	                maxLen = i - start + 1;
	                end = i;
	            }
	        }

	        return s.substring(start, end + 1);
	    }

	    public static void main(String[] args) {
	        String[] examples = {"aab", "pwwkew", "abcbcabcda"};	      
	        	
	        for (String example : examples) {
	            System.out.println("Longest substring without repeating characters in '" + example + "': " + longestSubstringWithoutRepeating(example));
	        
	        }
	    }
	


}
