package leetcode;

public class P108 {

    public TreeNode sortedArrayToBST(int[] nums) {
       return createTree(nums, 0, nums.length-1);
    }

	public TreeNode createTree(int[] nums, int i, int j) {
		if(i >= j) {
			return new TreeNode(nums[i]);
		} else {
			int center = (i + j) / 2;
			TreeNode node = new TreeNode(nums[center]);
			node.left = createTree(nums, i, center - 1);
			node.right = createTree(nums, center + 1, j);
			return node;
		}
	}

}
