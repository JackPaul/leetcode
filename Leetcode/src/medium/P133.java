package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P133 {
	class UndirectedGraphNode {
		int label;
		List<UndirectedGraphNode> neighbors;
		UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
	}
	
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
    	Map<Integer, UndirectedGraphNode> nodes = new HashMap<>();
    	return clone(node, nodes);
    }

	private UndirectedGraphNode clone(UndirectedGraphNode node, Map<Integer, UndirectedGraphNode> nodes) {
		if(node == null)
			return null;
		
		if(nodes.containsKey(node.label)) {
			for(UndirectedGraphNode un : node.neighbors) {
				nodes.get(node.label).neighbors.add(clone(un, nodes));
			}
			return nodes.get(node.label);
		} else {
			UndirectedGraphNode root = new UndirectedGraphNode(node.label);
			nodes.put(node.label, root);
			for(UndirectedGraphNode un : node.neighbors) {
				if(un.label == node.label)
					root.neighbors.add(root);
				else
					root.neighbors.add(clone(un, nodes));
			}
			return root;
		}
	}




}
