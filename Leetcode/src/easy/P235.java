package easy;

public class P235 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    	if(p.val < q.val) {
    		if(root == q || root == p)
    			return root;
    		if(root.val < q.val && root.val > p.val)
    			return root;
    		if(root.val > q.val)
    			return lowestCommonAncestor(root.left, p, q);
    		else
    			return lowestCommonAncestor(root.right, p, q);
    	} else {
    		if(root == q || root == p)
    			return root;
    		if(root.val < p.val && root.val > q.val)
    			return root;
    		if(root.val > p.val)
    			return lowestCommonAncestor(root.left, p, q);
    		else
    			return lowestCommonAncestor(root.right, p, q);
    	}
    }
    
    public boolean isAncestor(TreeNode root, TreeNode p) {
    	if(root == null)
    		return false;
    	if(root == p)
    		return true;
    	if(root.val < p.val)
    		return isAncestor(root.right, p);
    	else
    		return isAncestor(root.left, p);
    }

}
