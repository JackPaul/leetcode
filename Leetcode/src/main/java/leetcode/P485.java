package leetcode;
public class P485 {

	public static int findMaxConsecutiveOnes(int[] nums) {
        int maxLength=0;
        int i=0, j=0;
        boolean flag = false;
        while(j < nums.length) {
        	if(nums[j] == 1) {
        		//之前还未找到1;
        		if(!flag) {
        			i = j;
        			flag = true;
        		}
        	} else {
        		if(flag) {
        			maxLength = maxLength>j-i?maxLength:j-i;
        			flag=false;
        			i = j;
        		} 
        	}
        	j++;
        }
        
        if(j == nums.length && flag) {
        	maxLength = maxLength>j-i?maxLength:j-i;
        }
        return maxLength;
    }

	public static void main(String[] args) {
		int[] a = {1,1,0,1,1,1,0,1,1,1};
		int[] b = {};
		System.out.println(findMaxConsecutiveOnes(b));
	}
}
