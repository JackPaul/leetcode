package easy;

public class P111 {

    public int minDepth(TreeNode root) {
    	if(root == null)
    		return 0;
    	if(root.left == null && root.right == null)
    		return 1;
        int left =  minDepthHelper(root.left, 1);
        int right = minDepthHelper(root.right, 1);
        if(!(left != 1 && right != 1))
        	return Math.max(left, right);
        else
        	return Math.min(left, right);
    }

	public int minDepthHelper(TreeNode root, int i) {
		if(root == null)
			return i;
		if(root.left == null && root.right == null)
			return i+1;
		else if(root.left != null && root.right != null)
			return Math.min(minDepthHelper(root.left, i+1), minDepthHelper(root.right, i+1));
		else if(root.left != null)
			return minDepthHelper(root.left, i+1);
		else
			return minDepthHelper(root.right, i+1);
	}
    

}
