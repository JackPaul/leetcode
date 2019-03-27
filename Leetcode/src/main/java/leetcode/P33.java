package leetcode;


public class P33 {
	
	 public static int search(int[] nums, int target) {
	        return binarySearch(nums, 0, nums.length - 1, target);
	 }

	private static int binarySearch(int[] nums, int i, int j, int t) {
		if(i > j)
			return -1;
		if(nums[i] == t)
			return i;
		if(nums[j] == t)
			return j;
		
		int center = (i + j) / 2;
		if(nums[center] == t)
			return center;
		if(center == nums.length - 1 || center == 0)
			return -1;
		
		if(nums[center] > t) {
			if(nums[center] > nums[center+1]) {
				return binarySearch(nums, i + 1, j - 1, t);
			}	
		} else {
			if(nums[center] < nums[center-1]) {
				return binarySearch(nums, i + 1, j - 1, t);
			}
		}
		
		int r1 = binarySearch(nums, i+1, center - 1, t);
		int r2 = binarySearch(nums, center + 1, j-1, t);
		if(r1 == -1 && r2 == -1)
			return -1;
		if(r1 != -1)
			return r1;
		if(r2 != -1)
			return r2;
		return -1;
	}	
	public static void main(String[] args) {
		int[] nums = {1,2 ,3, 4, 5, 6};
		System.out.println(search(nums, 4));
	}
}
