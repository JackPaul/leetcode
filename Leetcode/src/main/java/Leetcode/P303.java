package easy;

class NumArray {
	int[] nums;
    public NumArray(int[] nums) {
        this.nums = nums;
    }
    
    public int sumRange(int i, int j) {
    	if(nums.length == 0)
    		return 0;
        int total = 0;
        if(i < 0)
        	return 0;
        if(j >= nums.length)
        	j = nums.length-1;
        for(int k = i; k <= j; k++) {
        	total += nums[k];
        }
        
        return total;
    }
}
public class P303 {

	public static void main(String[] args) {
		int[] nums = {-2, 0, 3, -5, 2, -1};
		NumArray obj = new NumArray(nums);
		System.out.println(obj.sumRange(1,3));
	}
	
}
