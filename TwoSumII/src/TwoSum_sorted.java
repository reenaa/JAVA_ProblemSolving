import java.util.*;
public class TwoSum_sorted {
	public static void main(String[] args){
		int[] numbers = {2,7,11,15};
		int target = 9;
		int[] result = new int[2];
		result = twoSum(numbers,target);
		System.out.println(result[0] +", "+result[1]);
	}
	public static int[] twoSum(int[] numbers, int target){
		int low = 0, high = numbers.length-1;
		while(low < high){
			int sum = numbers[low] + numbers[high];
			if(sum == target)
				return new int[] {low+1, high+1};
			else if(sum < target)
				++low;
			else 
				--high;
		}
		return new int[] {-1,-1};
	}
}
