package easy;

public class P437 {

    public int pathSum(TreeNode root, int sum) {
        if(root == null)
        	return 0;
    	return hasSum(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }
    
    public int hasSum(TreeNode root, int sum) {
    	if(root == null)
    		return 0;
    	if(root.val == sum)
    		return 1;
    	return hasSum(root.left, sum - root.val) + hasSum(root.right, sum - root.val);	
    }
}
