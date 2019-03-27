package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P589 {
	class Node {
	    public int val;
	    public List<Node> children;

	    public Node() {}

	    public Node(int _val,List<Node> _children) {
	        val = _val;
	        children = _children;
	    }
	};

	public List<Integer> preorder(Node root) {
       List<Integer>  res = new ArrayList<>();
       preVisit(root, res);
       return res;
    }
	
	public static void preVisit(Node root, List<Integer>  res) {
		if(root == null)
			return;
		res.add(root.val);
		for(Node node : root.children) {
			preVisit(node, res);
		}
	}

}
