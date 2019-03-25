package medium;


public class P34 {
    public int[] searchRange(int[] nums, int target) {
        int [] res = new int[2];
        res[0] = -1;res[1] = -1;
        
        if(nums.length ==0 || target <nums[0] || target > nums[nums.length - 1])
        	return res;
        int left = leftBoundary(nums, target, 0, nums.length - 1);
        int right = rightBoundary(nums, target, 0, nums.length - 1);
        if(left == -1 && right == -1)
        	return res;
        if(left != -1 && right != -1) {
        	res[0] = left; res[1] = right;
        } else if(left != -1 && right == -1) {
        	res[0] = left; res[1] = left;
        } else {
        	res[0] = right; res[1] = right;
        }	
        return res;
    }

    
    public static int leftBoundary(int[] nums, int t, int low, int high) {
    	if(low > high)
    		return -1;
    	if(high >= nums.length || low < 0)
    		return -1;
    	if(nums[low] == t)
    		return low;

    	int center = (low + high) / 2;
    	if(nums[center] == t) {
    		int left = leftBoundary(nums, t, low, center - 1);
    		if(left != -1)
    			return left;
    		else
    			return center;
    	} else if(nums[center] < t) {
    		return leftBoundary(nums, t, center + 1, high);
    	} else {
    		return leftBoundary(nums, t, low, center - 1);
    	}
    }
    
    public static int rightBoundary(int[] nums, int t, int low, int high) {
    	if(low > high)
    		return -1;
    	if(high >= nums.length || low < 0)
    		return -1;
    	if(nums[high] == t)
    		return high;
    	
    	int center = (low + high) / 2;
    	if(nums[center] == t) {
    		int right = rightBoundary(nums, t, center+1, high);
    		if(right != -1)
    			return right;
    		else
    			return center;
    	} else if(nums[center] < t) {
    		return rightBoundary(nums, t, center + 1, high);
    	} else {
    		return rightBoundary(nums, t, low, center - 1);
    	}
    }
    
    public static void main(String[] args) {
		int[] nums = {5,7,7,8,8,10};
		System.out.println(rightBoundary(nums, 8, 0, nums.length - 1));
	}
/*    
    public int rightBoundary(int[] nums, int t, int low, int high) {
    	;
    }
    

    
    private void searchRange(int[] nums, int i, int j, int t, int[] res) {
		if(nums[i] == t && nums[j] == t) {
			res[0] = i;res[1] = j;
			return;
		}
		int center = (i + j) / 2;
		
		
		
	}

	
	private int[] searchRange(int[] nums, int i, int j, int t) {
		int [] res = new int[2];

		int center = (i + j) / 2;
		if(nums[center] == t)
		return res;
		return res;
	}
*/
}
