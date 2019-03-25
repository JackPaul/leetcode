package medium;

public class P153 {
    public static int findMin(int[] nums) {
        return nums[findMinHelper(nums, 0, nums.length - 1) + 1];
    }

	private static int findMinHelper(int[] nums, int i, int j) {
		if(i == j)
			return -1;
		if(i == j - 1) {
			if(nums[i] > nums[j])
				return i;
			else
				return -1;
		}
		int center = (i + j) / 2;
		if(center < nums.length - 1 && nums[center] > nums[center + 1])
			return center;
		
		int left = findMinHelper(nums, i, center);
		int right = findMinHelper(nums, center, j);
		if(left == -1 &&j == -1)
			return -1;
		if(left != -1)
			return left;
		if(right != -1)
			return right;	
		return -1;
	}
	
	public static void main(String[] args) {
		int[] nums = {1,2};
		System.out.println(findMin(nums));
	}
    
    
}
