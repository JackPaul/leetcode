package medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
    	List<List<Integer>> res = new ArrayList<>();
        if(root == null)
            return res;
    	Queue<TreeNode> nodes = new LinkedList<>();
    	nodes.offer(root);
    	
    	while(!nodes.isEmpty()) {
    		TreeNode node = nodes.poll();
    		int i = level(root, node);
    		if(i >= res.size()) {
    			List<Integer> list = new ArrayList<>();
    			list.add(node.val);
    			res.add(list);
    		} else {
    			res.get(i).add(node.val);
    		}
    		
    		if(node.left != null)
    			nodes.offer(node.left);
    		if(node.right != null)
    			nodes.offer(node.right);
    	}
    	return res;
    }
    
   
    public int level(TreeNode root, TreeNode node) {
    	return helper(root, node, 0);
    }


	private int helper(TreeNode root, TreeNode node, int i) {
		if(root == null)
			return -1;
		if(node == root)
			return i;
		else {
			int left = helper(root.left, node, i+1);
			int right = helper(root.right, node, i+1);
			if(left == right && left == -1)
				return -1;
			else if(left == -1) {
				return right;
			} else {
				return left;
			}
		}
	}

}
