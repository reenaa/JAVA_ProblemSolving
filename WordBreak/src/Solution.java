
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class Solution {
	 
	public static void main(String[] args)
	{
		 String s = "leetcode";
		 ArrayList<String> worddict = new ArrayList<String>();
		 worddict.add("leet");
		 worddict.add("code");
		 System.out.println(worddict);
		 
		 boolean[] dp = new boolean[s.length()+1];
		 dp[0] = true;
		 Set<String> dict = new HashSet<>();
		 dict.addAll(worddict);
		 for(int i=1; i<=s.length();i++)
		 {
			 for(int j=0;j<i;j++)
			 {
				 System.out.println("i = "+i+" j ="+j+" substring ="+s.substring(j,i));
				 if(dp[j] && dict.contains(s.substring(j, i)))
				 {
					 dp[i] = true;
				 }
			 }
		 }
		 System.out.println(dp[s.length()]);
	}
	
}
