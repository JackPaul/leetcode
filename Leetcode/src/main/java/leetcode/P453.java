package leetcode;

public class P453 {

    public static int minMoves(int[] nums) {
        int total = nums[0];
        int min = nums[0];
        int i = 0;
        for(i = 1; i < nums.length; i++) {
        	total += nums[i];
        	if(nums[i] < min)
        		min = nums[i];
        }
        return total - min * nums.length;
    }
    
    public static void main(String[] args) {
    	int[] a = {-100,0,100};
		System.out.println(minMoves(a));
	}
}
