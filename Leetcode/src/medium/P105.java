package medium;

public class P105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTreeHelper(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
    }

	private TreeNode buildTreeHelper(int[] preorder, int i, int j, int[] inorder, int k, int l) {
		if(i > j || k > l)
			return null;
		int n = preorder[i];
		TreeNode root = new TreeNode(n);
		if(k == l || i == j)
			return root;
		int  p = search(inorder, k, l, n);
		
		root.left = buildTreeHelper(preorder, i+1, i+p-k, inorder, k, p-1);
		root.right = buildTreeHelper(preorder, i+p-k+1, j, inorder, p+1, l);
		return root;
	}
	
	public int search(int[] nums, int i, int j, int t){
		for(int k = i; k <= j; k++)
			if(nums[k] == t)
				return k;
		return -1;
	}
}
