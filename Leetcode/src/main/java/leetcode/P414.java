package leetcode;
public class P414 {
    public static int thirdMax(int[] nums) {
        if(nums.length == 1) 
        	return nums[0];
        if(nums.length == 2)
        	return nums[0]>nums[1]?nums[0]:nums[1];
        
        int m1=Integer.MIN_VALUE, m2=Integer.MIN_VALUE, m3=Integer.MIN_VALUE;
        boolean flag=false;
        for(int  i = 0; i < nums.length; i++) {
			if(nums[i] == Integer.MIN_VALUE)
				flag = true;
        	if(nums[i] > m1) {
        		m3=m2;m2 = m1;
        		m1 = nums[i];
        	} else if(nums[i] < m1) {
        		if(nums[i] > m2) {
        			m3 = m2;
        			m2 = nums[i];
        		} else if(nums[i] < m2) {
        			if(nums[i] > m3)
        				m3 = nums[i];
        		}
        	}
        }
        if(flag && m3 == Integer.MIN_VALUE && m2 != Integer.MIN_VALUE)
        	return Integer.MIN_VALUE;
        return m3==Integer.MIN_VALUE?m1:m3;
        
    }
    
    public static void main(String[] args) {
		int nums[] = {1,-2147483648,2};
		System.out.println(thirdMax(nums));
		System.out.println(Integer.MIN_VALUE == -2147483648 );
	}
}
