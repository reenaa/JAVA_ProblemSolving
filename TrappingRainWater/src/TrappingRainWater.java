
public class TrappingRainWater {
	public static void main(String[] args)
	{
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		int leftmax = 0, rightmax=0;
		int left=0, right = height.length-1;
		int result = 0;
		while(left<=right)
		{
			if(height[left] < height[right]){
				if(leftmax < height[left]){
					leftmax = height[left];
				}
				else{
					result += leftmax - height[left];
					left++;
				}
			}
			else{
				if(rightmax < height[right]){
					rightmax = height[right];
				}
				else{
					result += rightmax - height[right];
					right--;
				}
			}
		}
		System.out.print("Rain water = "+result);
	}

}
