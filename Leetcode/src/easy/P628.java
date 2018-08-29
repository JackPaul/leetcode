package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P628 {

    public static int maximumProduct(int[] nums) {
    	//是否含0
    	boolean containsZero = false;
    	//存储最大三个正整数
    	List<Integer> maxPos = new ArrayList<Integer>();
    	//存储最小三个正整数
    	List<Integer> minPos = new ArrayList<Integer>();
    	//存储最大三个负整数
    	List<Integer> maxNeg = new ArrayList<Integer>();
    	//存储最小三个负整数
    	List<Integer> minNeg = new ArrayList<Integer>();
    	for(int i = 0; i < nums.length; i++) {
    		if(nums[i] == 0) {
    			containsZero = true;
    		} else if(nums[i] > 0) {
    			if(maxPos.size() <= 2) {
    				maxPos.add(nums[i]);
    				Collections.sort(maxPos);
    			} else {
    				if(nums[i] > maxPos.get(2)) {
    					maxPos.set(0, maxPos.get(1));
    					maxPos.set(1, maxPos.get(2));
    					maxPos.set(2, nums[i]);
    				} else if(nums[i] <= maxPos.get(0)) {
    					;
    				}else if(nums[i] > maxPos.get(1)) {
    					maxPos.set(0, maxPos.get(1));
    					maxPos.set(1, nums[i]);
    				} else if(nums[i] > maxPos.get(0)){
    					maxPos.set(0, nums[i]);
    				}
    			}
    			
    			if(minPos.size() <= 2) {
    				minPos.add(nums[i]);
    				Collections.sort(minPos);
    			} else {
    				if(nums[i] >minPos.get(2)) {
    					;
    				} else if(nums[i] <=minPos.get(0)) {
    					minPos.set(2,minPos.get(1));
    					minPos.set(1,minPos.get(0));
    					minPos.set(0, nums[i]);
    				}else if(nums[i] >minPos.get(1)) {
    					minPos.set(2, nums[i]);
    				} else {
    					minPos.set(2,minPos.get(1));
    					minPos.set(1, nums[i]);
    				}
    			}
    		} else {
                if(maxNeg.size() <= 2) {
                    maxNeg.add(nums[i]);
                    Collections.sort(maxNeg);
                } else {
                    if(nums[i] > maxNeg.get(2)) {
                        maxNeg.set(0, maxNeg.get(1));
                        maxNeg.set(1, maxNeg.get(2));
                        maxNeg.set(2, nums[i]);
                    } else if(nums[i] <= maxNeg.get(0)) {
                        ;
                    }else if(nums[i] > maxNeg.get(1)) {
                        maxNeg.set(0, maxNeg.get(1));
                        maxNeg.set(1, nums[i]);
                    } else {
                        maxNeg.set(0, nums[i]);
                    }
                }
                
                if(minNeg.size() <= 2) {
                    minNeg.add(nums[i]);
                    Collections.sort(minNeg);
                } else {
                    if(nums[i] >minNeg.get(2)) {
                        ;
                    } else if(nums[i] <=minNeg.get(0)) {
                        minNeg.set(2,minNeg.get(1));
                        minNeg.set(1,minNeg.get(0));
                        minNeg.set(0, nums[i]);
                    }else if(nums[i] >minNeg.get(1)) {
                        minNeg.set(2, nums[i]);
                    } else {
                        minNeg.set(2,minNeg.get(1));
                        minNeg.set(1, nums[i]);
                    }
                }
    		}
    	}
    	
    	if(maxPos.size() == 0) {
    		if(containsZero)
    			return 0;
    		else
    			return maxNeg.get(0) * maxNeg.get(1) * maxNeg.get(2);    					
    	} else if(maxPos.size() == 1) {
    		if(minNeg.size() < 2)
    			return 0;
    		else
    			return minNeg.get(0) * minNeg.get(1) * maxPos.get(0);
    	} else if(maxPos.size() == 2) {
    		if(minNeg.size() <= 1) {
    			if(containsZero)
    				return 0;
    			else
    				return minNeg.get(0) * maxPos.get(1) * maxPos.get(2);
    		} else {
    			return minNeg.get(0) * minNeg.get(1) * maxPos.get(2);
    		}
    	} else {
    		if(minNeg.size() <= 1)
    			return maxPos.get(0) * maxPos.get(1) * maxPos.get(2);
    		else
    			return max(maxPos.get(0) * maxPos.get(1) * maxPos.get(2),
    				maxPos.get(2) * minNeg.get(0) * minNeg.get(1)
    				);
    	}
    }
    
    public static int max(int... nums) {
    	int max = nums[0];
    	for(int  i = 1; i < nums.length; i++) {
    		if(max < nums[i])
    			max = nums[i];
    	}
    	
    	return max;
    }
    public static void main(String[] args) {
    	int[] a = {1,2,3,2};
		System.out.println(maximumProduct(a));
	}
}
