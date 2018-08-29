package easy;


class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }


public class P617 {


  	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 != null && t2 != null) {
        	t1.val += t2.val;
        	boolean flag1 = (t1.left == null), flag2 = (t1.right == null);
      	
        	if(t1.left == null && t2.left != null) {
        		t1.left = t2.left;
        	}
        	if(t1.right == null && t2.right != null) {
        		t1.right = t2.right;
        	}
        	if(flag1 && !flag2) {
        		mergeTrees(t1.right, t2.right);
        	}
        	if(!flag1 && flag2) {
        		mergeTrees(t1.left, t2.left);
        	}
        	if(!flag1 && !flag2) {
        		mergeTrees(t1.left, t2.left);
        		mergeTrees(t1.right, t2.right);
        	}
        } else if(t1 == null) {        
            t1 = t2;
        }

		return t1;
    }



}
