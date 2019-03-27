package leetcode;

public class P215 {
    public static int findKthLargest(int[] nums, int k) {
        int[] kth = new int[k];
        
        int index = 0;
        for(int i = 0; i < nums.length; i++) {
        	if(index < k) {
        		int j = 0;
        		for(j = 0; j < index && kth[j] > nums[i]; j++)
        			;
        		for(int m = index; m > j; m--)
        			kth[m] = kth[m-1];
        		kth[j] = nums[i];
        		index++;
        	} else {
        		if(nums[i] > kth[k-1]) {
        			int j = 0;
            		for(j = 0; j < k && kth[j] > nums[i]; j++)
            			;
            		for(int m = k - 1; m > j; m--)
            			kth[m] = kth[m-1];
            		kth[j] = nums[i];
        		}
        	}
        }
        
        return kth[k-1];
    }
    
    public static void main(String[] args) {
    	int nums[] = {3,2,1,5,6,4};
		System.out.println(findKthLargest(nums, 4));
	}
}
