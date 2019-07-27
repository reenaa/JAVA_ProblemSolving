import java.util.HashMap;
import java.util.Arrays;
public class TwoSumCls 
{
	public static void main(String[] args)
	{
		int[] nums = {2,7,11,15};
		int target = 9;
		int[] arr = new int[2];
		arr = twoSum(nums,target);
		System.out.println(arr[0]+","+arr[1]);
	}
	public static int[] twoSum(int[] nums,int target)
	{
		if(nums==null || nums.length <2)
			return new int[] {0,0};
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0; i<nums.length; i++)
		{
			if(map.containsKey(num[i]))
				return int[](map.get(num[i],i));
			else
				map.put(target-num[i], i);
		}
		return new int[]{0,0};
		
	}

	
}
