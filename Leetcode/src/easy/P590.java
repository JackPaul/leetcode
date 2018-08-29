package easy;

import java.util.ArrayList;
import java.util.List;

import easy.P559.Node;

public class P590 {

	public List<Integer> postorder(Node root) {
		List<Integer> res = new ArrayList<>();
		if(root != null) {
			for(Node node : root.children) {
	        	res.addAll(postorder(node));
	        }
	        res.add(root.val);
		}
        return res;
    }

}
