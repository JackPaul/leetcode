package easy;

import java.util.ArrayList;
import java.util.List;

public class P543 {

    public int diameterOfBinaryTree(TreeNode root) {
    	if(root == null)
    		return 0;
        //计算每个节点的左右子树深度
    	return max(depth(root.right) + depth(root.left), diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right));
    		
    }
    
    public int depth(TreeNode root) {
    	if(root == null)
    		return 0;
    	return 1 + Math.max(depth(root.left), depth(root.right));
    }
    
    public int max(int... nums) {
    	int max = nums[0];
    	for(int  i = 1; i < nums.length; i++) {
    		if(max < nums[i])
    			max = nums[i];
    	}
    	
    	return max;
    }

}
