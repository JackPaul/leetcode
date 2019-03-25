package easy;

import easy.P226.TreeNode;

public class P100 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)
        	return true;
        else if(p != null && q != null) {
        	if(p.val != q.val)
        		return false;
        	else {
        		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        	}
        } else {
        	return false;
        }
    }

	public static void main(String[] args) {

	}

}
