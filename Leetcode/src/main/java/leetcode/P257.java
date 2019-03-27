package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P257 {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        travelAndSave(root, res, "");
        return res;
    }

	public void travelAndSave(TreeNode root, List<String> res, String path) {
		if(root == null)
			return;
		if(root.left == null && root.right == null) {
			if(path != "")
				res.add(path.substring(2, path.length())+"->"+root.val);
			else
				res.add(path+root.val);
		} else if(root.left == null){
			travelAndSave(root.right, res, path+"->"+root.val);
		} else if(root.right == null) {
			travelAndSave(root.left, res, path+"->"+root.val);
		} else {
			travelAndSave(root.left, res, path+"->"+root.val);
			travelAndSave(root.right, res, path+"->"+root.val);
		}
		
	}

}
