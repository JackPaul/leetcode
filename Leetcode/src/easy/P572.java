package easy;

public class P572 {

//    public boolean isSubtree(TreeNode s, TreeNode t) {
//        if(s == null && t != null)
//        	return false;
//        if(s == null && t == null)
//        	return true;
//        if(s != null && t == null)
//        	return false;
//        
//        if(s.val == t.val)
//        	return (isSubtree(s.left, t) || isSubtree(s.right, t)) || isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
//        else
//        	return isSubtree(s.left, t) || isSubtree(s.right, t);
//    }
//    
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
    
    public boolean isSubtree(TreeNode s, TreeNode t) {
    	if(s == null && t == null)
    		return true;
    	if(s != null && t != null) {
    		if(s.val == t.val)
    			return isSameTree(s.left, t.left) && isSameTree(s.right, t.right) || isSubtree(s.left, t) && isSubtree(s.right, t);;
    	} if(s != null) {
    		return isSubtree(s.left, t) && isSubtree(s.right, t);
    	} else
    		return false;
    }
}
