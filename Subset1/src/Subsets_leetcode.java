import java.util.*;
public class Subsets_leetcode {
	public static void main(String[] args){
		int[] nums = {1,2,3};
		List<List<Integer>> lstSubset = subsets(nums);
		System.out.println("Lst = "+lstSubset);
	}
	public static List<List<Integer>> subsets(int[] nums){
		List<List<Integer>> result = new ArrayList<>();
		int powersetsize = 1<<nums.length;
		
		for(int i=0; i<powersetsize; i++){
			List<Integer> lst = new ArrayList<>();
			for(int j=0; j<nums.length; j++){
				int jshift = 1<<j;
				int ianding = i& (1<<j);
				System.out.println("i ="+i+" jshift ="+jshift+" ianding= "+ianding);
				if((i& (1<<j)) > 0){
					lst.add(nums[j]);
				}
			}
			result.add(lst);
		}
		return result;
	}
}
