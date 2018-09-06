package easy;

public class P704 {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int center = 0;
        while(low < high) {
        	center = (low + high) / 2;
        	if(nums[center] == target)
        		return center;
        	else if(nums[center] < target)
        		low = center + 1;
        	else
        		high = center - 1;
        }
        
        return -1;
    }
}
