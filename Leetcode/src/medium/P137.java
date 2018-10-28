package medium;

public class P137 {

    public int singleNumber(int[] nums) {
        int res = nums[0];
        
        for(int i = 1; i < nums.length; i++) {
        	int j = 1;
        	for(int k = 0; k < 32; k++) {
        		
        		j <<= 1;
        	}
        	
        }
    }

}
