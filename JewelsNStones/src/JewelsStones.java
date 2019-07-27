import java.util.*;
public class JewelsStones {
	public static void main(String[] args){
		//String s = "aAAbbbb";
		//String j = "aA";
		String s = "ZZ";
		String j = "z";
		int count = 0;
		HashSet<Character> hashset = new HashSet<Character>();
		for(int i=0; i<j.length();i++){
			hashset.add(j.charAt(i));
		}
		for(int i=0; i<s.length();i++){
			if(hashset.contains(s.charAt(i))){
				count++;
			}
		}
		System.out.println(count+" stones are jewels.");
	}

}
