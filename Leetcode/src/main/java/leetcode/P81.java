package leetcode;

public class P81 {
	 public static boolean search(int[] nums, int target) {
	        return binarySearch(nums, 0, nums.length - 1, target);
	 }

	private static boolean binarySearch(int[] nums, int i, int j, int t) {
		if(i > j)
			return false;
		if(nums[i] == t)
			return true;
		if(nums[j] == t)
			return true;
		
		int center = (i + j) / 2;
		if(nums[center] == t)
			return true;
		if(center == nums.length - 1 || center == 0)
			return false;
		
		if(nums[center] > t) {
			if(nums[center] > nums[center+1]) {
				return binarySearch(nums, i + 1, j - 1, t);
			}	
		} else {
			if(nums[center] < nums[center-1]) {
				return binarySearch(nums, i + 1, j - 1, t);
			}
		}
		
		boolean r1 = binarySearch(nums, i+1, center - 1, t);
		boolean r2 = binarySearch(nums, center + 1, j-1, t);

		return r1 || r2;
	}	
	public static void main(String[] args) {
		int[] nums = {2,5,6,0,0,1,2};
		System.out.println(search(nums, 0));
	}
}
