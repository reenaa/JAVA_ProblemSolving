import java.util.*;
public class TwoSum {
	public static void main(String[] args){
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		int[] result = getTwoSum(nums, target);
		
		System.out.println("result ="+result[0]+", "+result[1]);
	}
	public static int[] getTwoSum(int[] nums, int target){
		int[] result = new int[2];
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++){
			if(map.containsKey(target-nums[i])){
				result[0] = map.get(target - nums[i]);
				result[1] = i;
			}
			map.put(nums[i], i);
		}
		return result;
	}
	
}
