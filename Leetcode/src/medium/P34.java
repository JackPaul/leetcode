package medium;

public class P34 {
    public int[] searchRange(int[] nums, int target) {
        int [] res = new int[2];
        res[0] = -1;res[1] = -1;
        
        if(target <nums[0] || target > nums[nums.length - 1])
        	return res;
        searchRange(nums, 0, nums.length - 1, target, res);
        return res;
    }

	private void searchRange(int[] nums, int i, int j, int t, int[] res) {
		if(nums[i] == t && nums[j] == t) {
			res[0] = i;res[1] = j;
			return;
		}
		int center = (i + j) / 2;
		
		
		
	}

	private int[] searchRange(int[] nums, int i, int j, int t) {
		int [] res = new int[2];

		int center = (i + j) / 2;
		if(nums[center] == t)
		return res;
		return res;
	}
}
