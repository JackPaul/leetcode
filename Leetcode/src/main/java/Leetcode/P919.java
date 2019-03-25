package medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



class TreeNode {
    public int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class P919 {
	class CBTInserter {
		private TreeNode root = null;
	    public CBTInserter(TreeNode root) {
	        this.root = root;
	    }
	    
	    public int insert(int v) {
	    	List<TreeNode> nodes = new ArrayList<>();
	        Queue<TreeNode> queue = new LinkedList<>();
	        queue.offer(root);
	        while(!queue.isEmpty()) {
	        	TreeNode node = queue.poll();
	        	nodes.add(node);
	        	if(node.left != null)
	        		queue.offer(node.left);
	        	if(node.right != null)
	        		queue.offer(node.right);
	        }
	        
	        int len = nodes.size();
	        TreeNode res = null;
	        if(len % 2 == 0) {
	        	res = nodes.get((len / 2) - 1);
	        	res.right = new TreeNode(v);
	        } else {
	        	res = nodes.get(len / 2);
	        	res.left = new TreeNode(v);
	        }
	        
	        return res.val;
	    }
	    
	    public TreeNode get_root() {
	        return root;
	    }
	}
}
