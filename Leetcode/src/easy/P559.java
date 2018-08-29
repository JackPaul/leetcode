package easy;

import java.util.List;

public class P559 {
	class Node {
	    public int val;
	    public List<Node> children;

	    public Node() {}

	    public Node(int _val,List<Node> _children) {
	        val = _val;
	        children = _children;
	    }
	};
	
	public int maxDepth(Node root) {
      if(root == null) {
    	  return 0;
      } else {
    	  int depth=0;
    	  for(Node node:root.children) {
    		  int i = maxDepth(node);
    		  if(depth < i) {
    			  depth = i;
    		  }
    	  }
    	  return 1 + depth;
      }
    }

}
