package easy;

public class P189 {

    public void rotate(int[] nums, int k) {
    	 k = k % nums.length;
    	if(k == 0)
    		return;

    	int c;
        for(int i = 0; i < k; i++) {
        	c = nums[nums.length - 1];
        	for(int j = nums.length-1; j > 0; j--)
        		nums[j] = nums[j-1];
        	nums[0] = c;
        }
    }

}
