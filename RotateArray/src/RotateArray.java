
public class RotateArray {
	public static void main(String[] args){
		int[] nums = {1,2,3,4,5,6,7};
		int k = 3;
		/*	rotate 1 steps to the right: [7,1,2,3,4,5,6]
			rotate 2 steps to the right: [6,7,1,2,3,4,5]
			rotate 3 steps to the right: [5,6,7,1,2,3,4] */
		rotate(nums,k);
	}
	public static void rotate(int[] nums, int k){
		//to handle the case if k > nums.length
		if(k > nums.length)
			k = k%nums.length;
		System.out.println("k = "+k);
		print(nums);
		reverse(nums,0,nums.length-1); //Reverse all array
		print(nums);
		reverse(nums,0,k-1);			   //Reverse first part	
		print(nums);
		reverse(nums,k,nums.length - 1); //reverse second part
		print(nums);
	}
	public static void reverse(int[] nums, int i, int j){
		while(i < j){
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			i++;
			j--;
			
		}
	}
	public static void print(int[] nums){
		System.out.print("Array = ");
		for(int i=0; i<nums.length; i++){
			System.out.print(nums[i] +", ");
		}
		System.out.println();
	}
}
