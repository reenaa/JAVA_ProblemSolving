import java.util.*;
public class LongestSubstring {
	public static void main(String[] args){
		String s = "abcabcbbbb";
		int maxlen = lengthOfLongestSubstring(s);
		System.out.println("Length of Substring: "+maxlen);
		System.out.print("Substr = "+longestSubstring(s));
	}
	
	public static int lengthOfLongestSubstring(String s){
		int fast = 0;
		int slow = 0;
		int maxlen = 0;
		Set<Character> set = new HashSet<>();
		while(fast<s.length()){
			if(!set.contains(s.charAt(fast))){
				set.add(s.charAt(fast));
				fast++;
				maxlen = Math.max(maxlen, set.size());
			}
			else{
				set.remove(s.charAt(slow));
				slow++;
			}
		}
		return maxlen;
	}
	public static String longestSubstring(String s){
		int fast = 0;
		int slow = 0;
		int maxlen = 0;
		int start=0, end=0;
		String longsubstr = "";
		Set<Character> set = new HashSet<>();
		while(fast<s.length()){
			if(!set.contains(s.charAt(fast))){
				set.add(s.charAt(fast));
				fast++;
				//maxlen = Math.max(maxlen, set.size());
				if(maxlen < set.size()){
					maxlen = set.size();
					start = slow;
					end = fast;
				}
			}
			else{
				set.remove(s.charAt(slow));
				slow++;
			}
		}
		longsubstr = s.substring(start, end);
		return longsubstr;
	}
}
