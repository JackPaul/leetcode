package medium;

import java.util.ArrayList;
import java.util.List;

public class P513 {
    public int findBottomLeftValue(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        levelTravel(root, levels, 0);
        return levels.get(levels.size()-1).get(0);
    }

	private void levelTravel(TreeNode root, List<List<Integer>> levels, int i) {
		if(root == null)
			return;
		if(i >= levels.size()) {
			levels.add(new ArrayList<>());
		}
		levels.get(i).add(root.val);
		levelTravel(root.left, levels, i+1);
		levelTravel(root.right, levels, i+1);
	}
}
