package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P894 {

    public List<TreeNode> allPossibleFBT(int N) {
    	List<TreeNode> res = new ArrayList<TreeNode>();    	
    	allPossibleFBTHelper(res, N);
    	return res;
    }

	private void allPossibleFBTHelper(List<TreeNode> res, int n) {
		if(n == 1) {
			res.add(new TreeNode(0));
		} else {
			allPossibleFBTHelper(res, n - 2);
		}
		
	}

}
