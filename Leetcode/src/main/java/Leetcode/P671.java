package easy;

public class P671 {
    public int findSecondMinimumValue(TreeNode root) {
    	if(root == null || root.left == null)
    		return -1;
    	int left = findSecond(root.left, root.val);
    	int right = findSecond(root.right, root.val);
    	if(root.val == left && root.val == right)
    		return -1;
    	else if(root.val != left && root.val != right)
    		return Math.min(left, right);
    	else if(root.val != left)
    		return left;
    	else
    		return right;
    }

	public int findSecond(TreeNode root, int val) {
		if(root == null)
			return -1;
		if(root.left == null)
			return root.val;
		if(root.val > val)
			return root.val;
		else {
	    	int left = findSecond(root.left, root.val);
	    	int right = findSecond(root.right, root.val);
	    	if(left == val && right == val)
	    		return val;
	    	else if(left != val && right != val)
	    		return Math.min(left,  right);
	    	else if(left != val)
	    		return left;
	    	else
	    		return right;
		}
	}

}
