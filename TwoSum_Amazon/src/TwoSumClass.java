import java.util.*;
public class TwoSumClass {
	public static void main(String[] args)
	{
		int[] nums = {2,7,11,15};
		int target = 9;
		int[] twoSumArr = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<nums.length; i++)
		{
			if(map.containsKey(target - nums[i]))
			{
				twoSumArr[0] = i;
				twoSumArr[1] = map.get(target-nums[i]);
			}
			else
			{
				map.put(nums[i],i);
			}
		}
		System.out.println(twoSumArr[0]+","+twoSumArr[1]);
	}

}
