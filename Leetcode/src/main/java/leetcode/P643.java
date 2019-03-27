package leetcode;

public class P643 {
    public static double findMaxAverage(int[] nums, int k) {
    	if(k > nums.length)
    		return 0;
    	
    	
        int total = 0;
        for(int i = 0; i < k; i++) {
        	total += nums[i];
        }
        
        int max = total;
        for(int i = k; i < nums.length; i++) {
        	total -= nums[i - k];
        	total += nums[i];
        	if(total > max)
        		max = total;
        }
        return (double)(max) / k;
    }
    public static void main(String[] args) {
		int[] a = {1,12,-5,-6,50,3};
		System.out.println(findMaxAverage(a, 4));
	}
}
