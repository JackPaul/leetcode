package easy;

public class P111 {

    public int minDepth(TreeNode root) {
    	if(root == null)
    		return 0;
    	if(root.left == null && root.right == null)
    		return 1;
        int res = Math.min(depth(root.left, 1), depth(root.right, 1));
        return res < 2?2:res;
    }
    
    public int depth(TreeNode root, int level) {
    	if(root == null) {
    		return level + 1;
    	}
    	return Math.min(depth(root.left, level + 1), depth(root.right, level + 1));
    }
}
