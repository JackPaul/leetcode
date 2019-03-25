package medium;


public class P75 {
    public static void sortColors(int[] nums) {
        int left = 0, right = nums.length - 1;
        int i = 0;
        int c = 0;
        while(left < right && i <= right && i < nums.length) {
        	if(nums[i] == 0) {
        		//Íù×ó¶Ë½»»»
        		if(i > 0) {
        			if(nums[left] == 0) {
        				left++;
        			} else {
        				if(i > left) {
            				c = nums[left];
            				nums[left] = nums[i];
            				nums[i] = c;
            				left++;
        				} else {
        					i++;
        				}
        				
        			}
        		}else {
        			i++;
        		}
        	}
        	if(nums[i] == 2) {
        		//ÍùÓÒ¶Ë½»»»
        		if(i < nums.length - 1) {
        			if(nums[right] == 2) {
        				right--;
        			} else {
        				c = nums[right];
        				nums[right] = nums[i];
        				nums[i] = c;
        				right--;
        			}
        		}else {
        			i++;
        		}
        	}else if(nums[i] == 1){
        		i++;
        	}
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
    	int[] nums = {2,0,2,1,1,0};
		sortColors(nums);
	}
}

/*

if(i == 0 && j == nums.length - 1){
	if(nums[i] < nums[j]) {
		c = nums[i];
		nums[i] = nums[j];
		nums[j] = c;
	}
} else if(i > 0 && j < nums.length - 1) {
	if(nums[i] < nums[i-1]) {
		c = nums[i];
		nums[i] = nums[i-1];
		nums[i-1] = c;
	}
	
	if(nums[j] > nums[j+1]) {
		c = nums[j];
		nums[j] = nums[j+1];
		nums[j+1] = c;
	}
	
	if(nums[i] < nums[j]) {
		c = nums[i];
		nums[i] = nums[j];
		nums[j] = c;
	}
	
} else if(i > 0) {
	if(nums[i] < nums[i-1]) {
		c = nums[i];
		nums[i] = nums[i-1];
		nums[i-1] = c;
	}       		
	
	if(nums[i] < nums[j]) {
		c = nums[i];
		nums[i] = nums[j];
		nums[j] = c;
	}
} else {
	if(nums[j] > nums[j+1]) {
		c = nums[j];
		nums[j] = nums[j+1];
		nums[j+1] = c;
	}
	
	if(nums[i] < nums[j]) {
		c = nums[i];
		nums[i] = nums[j];
		nums[j] = c;
	}
}
i++;
j--;

*/