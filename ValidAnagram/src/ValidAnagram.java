import java.util.*;
public class ValidAnagram {
	public static void main(String[] args){
		String s = "anagram";
		String t = "nagaram";
		boolean b = isAnagram(s,t);
		if(b)
			System.out.println(s+" and "+t+" are Anagrams");
		else
			System.out.println("No Anagrams");
	}
	public static boolean isAnagram(String s,String t){
		if(s.length()!=t.length())
			return false;
		int[] counter = new int[26];
		for(int i=0; i<s.length();i++){
			counter[s.charAt(i) - 'a']++;
			counter[t.charAt(i) - 'a']--;
		}
		for(int count:counter){
			if(count!=0)
				return false;
		}
		return true;
	}
}
