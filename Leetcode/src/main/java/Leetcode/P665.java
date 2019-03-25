package easy;

public class P665 {

    public static boolean checkPossibility(int[] nums) {
        if(nums.length <= 2)
        	return true;
        
        //首元素大于次元素的情况
        if(nums[1] < nums[0]) {
        	for(int i = 2; i < nums.length; i++) {
            	if(nums[i] < nums[i-1])
            		return false;
            }
        	return true;
        }
        
        //首元素大于次元素的情况
        if(nums[nums.length -1] < nums[nums.length-2]) {
        	for(int i = 1; i < nums.length-2; i++) {
            	if(nums[i] < nums[i-1])
            		return false;
            }
        	return true;
        }
        
    	for(int i = 1; i < nums.length - 1; i++) {
        	if(nums[i] < nums[i-1] && nums[i] < nums[i+1]) {
        		if(nums[i+1] < nums[i-1])
        			return false;
        		else {
        			for(int j = i+1; j < nums.length; j++) {
        				if(nums[j] < nums[j-1])
        					return false;
        			}
        			
        			return true;
        		}
        	}
        	
        	if(nums[i] > nums[i-1] && nums[i] > nums[i+1]) {
        		if(nums[i+1] < nums[i-1])
        			return false;
        		else {
        			for(int j = i+2; j < nums.length; j++) {
        				if(nums[j] < nums[j-1])
        					return false;
        			}
        			
        			return true;
        		}
        	}
        		
        }
    	return true;
        
    }
    
    public static void main(String[] args) {
    	int[] a = {1,2,5,4,3};
    	
		System.out.println(checkPossibility(a));
	}
}
