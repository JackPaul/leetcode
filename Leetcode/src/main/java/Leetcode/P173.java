package medium;

public class P173 {
	public class BSTIterator {
		
		private TreeNode root;
	    public BSTIterator() {
	    }
	    public BSTIterator(TreeNode root) {
	        this.root = root;
	    }

	    /** @return whether we have a next smallest number */
	    public boolean hasNext() {
	        return !(root == null);
	    }

	    /** @return the next smallest number */
	    public int next() {
	    	int n = 0;
	        TreeNode cur = root;
	        TreeNode pre = null;//记住当前节点的父节点
	        while(cur.left != null) {
	        	pre = cur;
	        	cur = cur.left;
	        }
	        
	        if(pre == null) {
	        	n = root.val;
	        	root = root.right;
	        } else {
	        	n = cur.val;
	        	pre.left = cur.right;
	        }
	        return n;
	    }
	}
}
