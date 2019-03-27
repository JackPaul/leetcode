package leetcode;

public class P687 {

    public int longestUnivaluePath(TreeNode root) {
        if(root == null)
        	return 0;
        return max(pathLength(root.left, root.val, 0) + pathLength(root.right, root.val, 0), longestUnivaluePath(root.left), longestUnivaluePath(root.right));
    }
    
    public int pathLength(TreeNode root, int val, int len) {
    	if(root == null)
    		return len;
    	if(root.val != val) {
    		return len;
    	} else {
    		return Math.max(pathLength(root.left, val, len + 1), pathLength(root.right, val, len + 1));
    	}
    }
    
    public int max(int...nums) {
    	int max = nums[0];
    	for(int i : nums) {
    		if(i > max)
    			max = i;
    	}
    	return max;
    }
}

