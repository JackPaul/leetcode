package medium;
import java.util.ArrayList;
import java.util.List;

public class P116 {
	class TreeLinkNode {
		int val;
		TreeLinkNode left, right, next;
		TreeLinkNode(int x) { val = x; }
	}
    public void connect(TreeLinkNode root) {
        List<List<TreeLinkNode>> levels = new ArrayList<>();
        levelTravel(root, 0, levels);
        for(int i = 1; i < levels.size(); i++) {
        	List<TreeLinkNode> list = levels.get(i);
        	for(int j = 0; j < list.size() - 1; j++) {
        		list.get(j).next = list.get(j+1);
        	}
        }
        
    }
	private void levelTravel(TreeLinkNode root, int i, List<List<TreeLinkNode>> levels) {
		if(root == null)
			return;
		if(i >= levels.size()) {
			levels.add(new ArrayList<TreeLinkNode>());
		}
		levels.get(i).add(root);
		levelTravel(root.left, i+1, levels);
		levelTravel(root.right, i+1, levels);
		
	}
	
}
