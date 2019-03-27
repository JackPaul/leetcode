package leetcode;

public class P450 {
    public static TreeNode deleteNode(TreeNode root, int key) {
    		if(root == null)
    			return null;
    		if(root.val == key) {
    			if(root.left == null)
            		return root.right;
            	if(root.right == null)
            		return root.left;
            	TreeNode c = root.left;
            	TreeNode p = null;
            	while(c.right != null) {
            		p = c;
            		c = c.right;
            	}
            	
            	if(p != null) {
                	p.right = c.left;
                	c.left = root.left;
                	c.right = root.right;
            	} else {
            		c.right = root.right;
            	}

            	return c;
    		} else if(root.val > key) {
    			root.left = deleteNode(root.left, key);
    			return root;
    		} else {
    			root.right = deleteNode(root.right, key);
    			return root;
    		}	
    }
    
    
    public static void main(String[] args) {
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);
		node3.left = node2;node3.right=node4;
		node6.right=node7;node5.left=node3;
		node5.right=node6;
		inOrder(deleteNode(node5, 3));
	}
    
    
    static void inOrder(TreeNode t) {
    	if(t != null) {
    		inOrder(t.left);
    		System.out.println(t.val);
    		inOrder(t.right);
    	}
    }
}
