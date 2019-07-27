import java.util.*;
public class PartitionLabels {
	public static void main(String[] args){
		String s = "ababcbacadefegdehijhklij";
		List<Integer> ans = partitionLabels(s);
		
		System.out.println("\n"+ans);
	}

public static List<Integer> partitionLabels(String S) {
    int[] last = new int[26];
    
    for(int i=0; i<S.length(); ++i){
        last[S.charAt(i) - 'a'] = i;
    }
    for(int i=0; i<S.length(); ++i){
        System.out.print(last[i]+", ");
    }
    int j=0, anchor = 0;
    List<Integer> ans = new ArrayList<>();
    
    for(int i=0; i<S.length(); ++i){
        j = Math.max(j,last[S.charAt(i) - 'a']);
        
        if(i == j){
            ans.add(i - anchor + 1);
            anchor = i+1;
        }
    }
    return ans;
}
}