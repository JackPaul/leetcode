package medium;

import java.util.ArrayList;
import java.util.List;

public class P98 {
	/*
	 * 错误解法   没考虑到 右子树最小值必须大于根节点值  左子树最大值必须小于根节点值
    public boolean isValidBST(TreeNode root) {
        if(root == null)
        	return true;
        if(root.left != null && root.right != null) {
        	if(root.val > root.left.val && root.val < root.right.val) {
        		return isValidBST(root.left) && isValidBST(root.right);
        	} else {
        		return false;
        	}
        } else if(root.left == null && root.right == null) {
        	return true;
        } else if(root.left == null) {
        	if(root.val < root.right.val) {
        		return isValidBST(root.right);
        	} else {
        		return false;
        	}
        } else {
        	if(root.val > root.left.val) {
        		return isValidBST(root.left);
        	} else {
        		return false;
        	}
        }
    }
    */
    public boolean isValidBST(TreeNode root) {
    	List<Integer> res = new ArrayList<>();
    	 preVisit(root, res);
    	 if(res.size() <= 1)
    		 return true;
    	 for(int i = 1; i < res.size(); i++) {
    		 if(res.get(i) <= res.get(i-1))
    			 return false;
    	 }
    	 return true;
    }

	private void preVisit(TreeNode root, List<Integer> res) {
		if(root != null) {
			preVisit(root.left, res);
			res.add(root.val);
			preVisit(root.right, res);
		}
	}

	
}
