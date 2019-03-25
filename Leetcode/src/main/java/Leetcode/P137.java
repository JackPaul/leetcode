package medium;

public class P137 {

    public static int singleNumber(int[] nums) {
        int res = 0;
        
        for(int i = 0; i < 32; i++) {
        	int total = 0;
        	for(int j = 0; j < nums.length; j++) {
        		total += (nums[j] >> i) & 1;
        	}
        	total %= 3;
        	res = res | (total << i);
        }
        
        return res;
    }
    
    public static void main(String[] args) {
    	int nums[] = {-2,-2,1,1,-3,1,-3,-3,-4,-2};
		System.out.println(singleNumber(nums));
	}

}
