package leetcode;

public class P106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTreeHelper(postorder, 0, postorder.length-1, inorder, 0, inorder.length-1);
    }

	private TreeNode buildTreeHelper(int[] postorder, int i, int j, int[] inorder, int k, int l) {
		if(i > j || k > l || j < 0 || l < 0)
			return null;
		int n = postorder[j];
		TreeNode root = new TreeNode(n);
		if(k == l || i == j)
			return root;
		int  p = search(inorder, k, l, n);
		
		root.left = buildTreeHelper(postorder, i, i+p-k-1, inorder, k, p-1);
		root.right = buildTreeHelper(postorder, i+(p-k), j-1, inorder, p+1, l);
		return root;
	}
	
	public int search(int[] nums, int i, int j, int t){
		for(int k = i; k <= j; k++)
			if(nums[k] == t)
				return k;
		return -1;
	}
}
