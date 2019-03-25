package medium;

public class P260 {
    public static int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        
        int sum = 0;
        for(int i = 0; i < 32; i++) {
        	int total = 0;
        	for(int j = 0; j < nums.length; j++) {
        		total += (nums[j] >> i) & 1;
        	}
        	System.out.println(total%2);
        	sum = sum + ((total % 2) << i);
        }
        
        int xor = nums[0];
       	for(int i = 1; i < nums.length; i++) {
       		xor = xor ^ nums[i];
       	}
       	
       	
        return res;
    }
    
    public static void main(String[] args) {
    	int nums[] = {1,2,1,3,2,5};
		System.out.println(singleNumber(nums));
	}
}
