package leetcode;

public class P42 {

	 public static int trap(int[] height) {
	        if(height.length < 3)
	            return 0;
	        boolean[] hasRightHigher= new boolean[height.length];
	        hasRightHigher[height.length - 1] = false;
	        boolean[] hasLeftHigher= new boolean[height.length];
	        hasLeftHigher[0] = false;
	        int maxRightHeight  = height[height.length - 1];
	        int maxLeftHeight  = height[0];
	        
	        int[] left = new int[height.length];
	        int[] right= new int[height.length];
	        for(int i = height.length - 2; i >= 0; i--){
	            if(maxRightHeight  >= height[i]) {
	                hasRightHigher[i] = true;
	                right[i] = maxRightHeight;
	            } else {
	                maxRightHeight  = height[i];
	            }
	            
	            if(maxLeftHeight  >= height[height.length - i - 1]) {
	                hasLeftHigher[height.length - i - 1] = true;
	                left[height.length - i - 1] = maxLeftHeight;
	            } else {
	                maxLeftHeight  = height[height.length - i - 1];
	            }
	        }
	        
	        int total = 0;
	        for(int i = 1; i < height.length - 1; i++) {
	        	if(hasRightHigher[i] && hasLeftHigher[i])
	        		total += Math.min(left[i], right[i]) - height[i];
	        }
	        return total;
	    }
	 
	 public static void main(String[] args) {
		int[] a = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(a));
	}

}
