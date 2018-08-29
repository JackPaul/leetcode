package easy;

import java.util.ArrayList;
import java.util.List;

public class P107 {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
    	List<List<Integer>> res = new ArrayList<>();
    	travelAndSave(root, res, 0);
    	List<Integer> change = null;
    	int i = 0, j = res.size() - 1;
    	while(i < j) {
    		change = res.get(i);
    		res.set(i, res.get(j));
    		res.set(j, change);
    		i++;j--;
    	}
    	return res;
    }

	public void travelAndSave(TreeNode root, List<List<Integer>> res, int i) {
		if(root == null)
			return;
		if(res.size() <= i) {
			List<Integer> list = new ArrayList<>();
			list.add(root.val);
			res.add(list);
		} else {
			res.get(i).add(root.val);
		}
		travelAndSave(root.left, res, i+1);
		travelAndSave(root.right, res, i+1);
	}

}
