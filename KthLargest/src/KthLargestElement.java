
public class KthLargestElement {
	public static void main(String[] args)
	{
		int[] nums = {3,2,1,5,4,6};
		int k=4;
		if(nums == null || nums.length==0 || nums.length< k || k<1)
			return;
		int k_new = nums.length - k+1;
		int kthLarge = getKth(nums,0,nums.length,k_new);
		System.out.println(k+"th largest element ="+kthLarge);
	}
	public static int getKth(int[] nums, int start, int end, int k1)
	{
		int left = start;
		int right = end;
		int pivot = nums[end];
		while(true)
		{
			while(left<right && nums[left]<pivot)
			{
				left++;
			}
			while(left<right && nums[right]>pivot)
			{
				right++;
			}
			if(left==right)
				break;
			swap(nums,left,right);
		}
		swap(nums,left,end);
		
		if(k1==left+1){
			return pivot;
		}else if(k1<left + 1){
			return getKth(nums,start,left-1,k1);
		}
		else{
			return getKth(nums,left+1, end,k1);
		}	
	}
	public static void swap(int[] nums, int left, int right)
	{
		int temp = nums[left];
		nums[left] = nums[right];
		nums[right] = temp;
	}
}
