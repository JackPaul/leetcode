package easy;

public class P268 {

    public static int missingNumber(int[] nums) {
        boolean containsZero = false;
        boolean containsN = false;
        int posZero = 0;
        for(int i = 0; i < nums.length; i++) {
        	if(nums[i] == 0) {
        		containsZero  = true;
        		posZero = i;
        		nums[Math.abs(nums[i])] = Math.abs(nums[Math.abs(nums[i])]) * -1;
        	} else if(Math.abs(nums[i]) == nums.length) {
        		containsN = true;
        	} else {
        		nums[Math.abs(nums[i])] = Math.abs(nums[Math.abs(nums[i])]) * -1;
        	}
        }
        
        if(!containsN)
        	return nums.length;
        
        for(int i = 0; i < nums.length; i++) {
        	if(nums[i] > 0)
        		return i;
        }
        return posZero;
    }
    
    
    public static void main(String[] args) {
    	int[] a = {3, 0, 1};
    	System.out.println(missingNumber(a));
		
	}
}
