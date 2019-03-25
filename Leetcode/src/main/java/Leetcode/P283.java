package easy;

public class P283 {

	public void moveZeroes(int[] nums) {
		/*
		 * 这个改变了原来的次序
        int begin = 0, end = nums.length - 1;
        int c;
        while(begin < end) {
        	if(nums[begin] == 0) {
        		if(nums[end] != 0) {
        			//交换
        			c = nums[begin];
        			nums[begin] = nums[end];
        			nums[end] = c;
        		} else {
        			end--;
        		}
        	} else {
        		begin++;
        	}
        }
        */
		
		int index = 0;
		for(int i = 0; i <= nums.length - 1; i++) {
			if(nums[i] != 0) {
				nums[index++] = nums[i];
			}
		}
		
		for(int j = index; j <= nums.length - 1; j++) {
			nums[j] = 0;
		}
    }

}
