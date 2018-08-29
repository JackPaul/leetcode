package easy;

public class P437 {

    public int pathSum(TreeNode root, int sum) {
        if(root == null)
        	return 0;
        
        if(root.val == sum) {
        	return 1 + pathSum(root.left, sum) + pathSum(root.right, sum)
        	+ pathTotal(root.left, sum-root.val) + pathTotal(root.right, sum-root.val);
        } else {
        	return pathSum(root.left, sum) + pathSum(root.right, sum)
        	+ pathTotal(root.left, sum-root.val) + pathTotal(root.right, sum-root.val);
        }
//        if(root.left == null && root.right == null) {
//        	if(root.val == sum)
//        		return 1;
//        	return 0;
//        } else if(root.left != null && root.right != null) {
//            if(root.val == sum)
//            	return 1 + pathSum(root.left, sum) + pathSum(root.right, sum) 
//            	+ pathSum(root.left, sum-root.val) + pathSum(root.right, sum-root.val);
//            else
//            	return pathSum(root.left, sum) + pathSum(root.right, sum) 
//            	+ pathSum(root.left, sum-root.val) + pathSum(root.right, sum-root.val);
//        } else if(root.right != null) {
//            if(root.val == sum)
//            	return 1 + pathSum(root.right, sum) 
//            	+ pathSum(root.right, sum-root.val);
//            else
//            	return pathSum(root.right, sum) 
//            	+ pathSum(root.right, sum-root.val);
//        } else {
//            if(root.val == sum)
//            	return 1 + pathSum(root.left, sum)
//            	+ pathSum(root.left, sum-root.val);
//            else
//            	return pathSum(root.left, sum)  
//            	+ pathSum(root.left, sum-root.val);
//        }
        
    }

	private int pathTotal(TreeNode root, int target) {
		if(root == null)
			return 0;
		if(root.val == target)
			return 1 + pathTotal(root.left, target - root.val) + pathTotal(root.right, target - root.val);
		return pathTotal(root.left, target - root.val) + pathTotal(root.right, target - root.val);
	}
    
//    
//    public int pathTotal(TreeNode root, int target){
//    	if(root == null)
//    		return 0;
//    	if(root.val == target)
//    		return 1 + pathTotal(root.left, target-root.val) + pathTotal(root.right, target-root.val);;
//    	return pathTotal(root.left, target-root.val) + pathTotal(root.right, target-root.val);
//    }
//    

}
