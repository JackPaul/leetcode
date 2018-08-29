package easy;

public class P669 {
	class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	}
	
	
	public static TreeNode trimBST(TreeNode root, int L, int R) {
        if(root == null) {
        	return null;
        } else {
        	if(root.val > R) {
        		return trimBST(root.left, L, R);
        	} else if(root.val < L) {
        		return trimBST(root.right, L, R);
        	} else {
//        		if(root.left != null && root.left.val < L) {
//        			root.left = trimBST(root.left.right, L, R);
//        		} else {
        			root.left = trimBST(root.left, L, R);
//        		}
//        		
//        		if(root.right != null && root.right.val > R) {
//        			root.right = trimBST(root.right.left, L, R);
//        		} else {
        			root.right = trimBST(root.right, L, R);
//        		}
        		return root;
        	}
        }
    }
	
	public static void main(String[] args) {
		P669 p = new P669();
		TreeNode root = p.new TreeNode(3);
		root.right = p.new TreeNode(4);
		TreeNode t0 = p.new TreeNode(0);
		TreeNode t2 = p.new TreeNode(2);
		t2.left = p.new TreeNode(1);
		t0.right = t2;
		root.left = t0;
		
		trimBST(root, 1, 3);
	}

}
