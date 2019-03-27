package leetcode;

import java.util.HashMap;
import java.util.Map;

public class P697 {

    public static int findShortestSubArray(int[] nums) {
        int[][] flag = new int[50000][3];
        Map<Integer, Integer[]> map = new HashMap<>();
        int maxElements=0;
        int maxDegree=0;
        int res = 50000;
        
        for(int i = 0; i < nums.length; i++) {
        	if(flag[nums[i]][0] == 0) {
        		flag[nums[i]][0] = 1;
        		flag[nums[i]][1] = i;
        		flag[nums[i]][2] = i;
        	} else {
        		flag[nums[i]][0]++;
        		flag[nums[i]][2] = i;
        	}
        	if(maxDegree <= flag[nums[i]][0]) {
        		maxDegree = flag[nums[i]][0];
        		if(maxElements <= nums[i])
        			maxElements = nums[i];
        	}
        }
        
        for(int i = 0; i <= maxElements; i++) {
        	if(flag[i][0] == maxDegree) {
        		if((flag[i][2] + 1 - flag[i][1]) < res) {
        			res = flag[i][2] + 1 - flag[i][1];
        		}
        	}
        }
        
        return res;
    }
    
    public static void main(String[] args) {
    	int[] a = {1,2,2,3,1,4,2};
		System.out.println(findShortestSubArray(a));
	}

}
