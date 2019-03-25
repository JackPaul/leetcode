package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class P94 {
	/*
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inOrder(root, res);
        return res;
    }

	private void inOrder(TreeNode root, List<Integer> res) {
		if(root != null) {
			inOrder(root.left, res);
			res.add(root.val);
			inOrder(root.right, res);
		}
	}
	*/                                                                                                                                                                       
	
	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null)
        	return res;
        Map<TreeNode, Boolean> visited = new HashMap<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.push(root); 
        TreeNode node = null;
        while(!stack.isEmpty()) {
        	node = stack.pop();
        	if(visited.containsKey(node)) {
        		res.add(node.val);
        	} else {
        		if(node.left == null && node.right == null) {
        			res.add(node.val);
        		} else if(node.left != null && node.right != null) {
        			stack.push(node.right);
        			stack.push(node);
        			stack.push(node.left);
        			visited.put(node, true);
        		} else if(node.left != null) {
        			stack.push(node);
        			stack.push(node.left);
        			visited.put(node, true);
        		} else {
        			stack.push(node.right);
        			stack.push(node);
        			visited.put(node, true);
        		}
        	}
        }
        return res;
    }
}
