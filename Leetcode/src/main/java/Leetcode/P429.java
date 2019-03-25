package easy;

import java.util.ArrayList;
import java.util.List;

public class P429 {
	class Node {
	    public int val;
	    public List<Node> children;

	    public Node() {}

	    public Node(int _val,List<Node> _children) {
	        val = _val;
	        children = _children;
	    }
	};

	public List<List<Integer>> levelOrder(Node root) {
		List<List<Integer>> res = new ArrayList<>();
		levelVisit(root, res, 0);
		return res;
    }

	public void levelVisit(Node root, List<List<Integer>> res, int i) {
		if(root == null)
			return;
		if(res.size() - 1 < i) {
			List<Integer> list = new ArrayList<>();
			list.add(root.val);
			res.add(list);
		} else {
			res.get(i).add(root.val);
		}
		
		if(root.children != null) {
			for(Node child : root.children) {
				levelVisit(child, res, i+1);
			}
		}
		
	}
}
