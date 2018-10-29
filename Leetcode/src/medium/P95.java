package medium;

import java.util.ArrayList;
import java.util.List;

public class P95 {
    public List<TreeNode> generateTrees(int n) {

    	@SuppressWarnings("unchecked")
		List<TreeNode>[] dp = new List[n+1];
    	dp[0] = new ArrayList<>();
    	if(n < 1)
    		return dp[0];
    	dp[1] = new ArrayList<>();
    	dp[1].add(new TreeNode(1));
    	
    	for(int i = 2; i <= n; i++) {
    		dp[i] = new ArrayList<>();
    		TreeNode root = null;
    		for(TreeNode tree : copyN(dp[i-1], 0)) {
    			root = new TreeNode(i);
    			root.left = tree;
    			dp[i].add(root);
    		}
    		
    		for(TreeNode tree : copyN(dp[i-1], 1)) {
    			root = new TreeNode(1);
    			root.right = tree;
    			dp[i].add(root);
    		}

    		for(int j = i - 1; j >= 2; j--) {
    			System.out.println(j);
    			List<TreeNode> left = copyN(dp[j-1], 0);
    			List<TreeNode> right = copyN(dp[i-j], j);
    			for(int m = 0; m < left.size(); m++) {
    				for(int k = 0; k < right.size(); k++) {
    					root = new TreeNode(j);
    					root.left = copy(left.get(m),0);
    					root.right = copy(right.get(k),0);
    					dp[i].add(root);
    				}
    			}
    			
    		}
    	}
    	return dp[n];
    }
    
    
    //给二叉树增加n
    private List<TreeNode> copyN(List<TreeNode> list, int n) {
    	ArrayList<TreeNode> res = new ArrayList<>();
		for(TreeNode root : list) {
			res.add(copy(root, n));
		}
		return res;
	}

	private TreeNode copy(TreeNode root, int n) {
		if(root == null)
			return null;
		TreeNode res = new TreeNode(root.val+n);
		res.left = copy(root.left, n);
		res.right = copy(root.right, n);
		return res;	
	}
   
}
