package leetcode;

public class P654 {
    public  static TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumBinaryTree(nums, 0, nums.length - 1);
    }

	private static TreeNode constructMaximumBinaryTree(int[] nums, int begin, int end) {
		if(begin > end || begin >= nums.length || end < 0)
			return null;
		TreeNode root = null;
		int max = nums[begin];
		int index = begin;
		int i;
		for(i = begin + 1; i <= end; i++) {
			if(nums[i] > max) {
				max = nums[i];
				index = i;
			}
		}
		if(index == begin) {
			root = new TreeNode(nums[index]);
			root.right = constructMaximumBinaryTree(nums, begin + 1, end);
		} else if(index == end) {
			root = new TreeNode(nums[index]);
			root.left = constructMaximumBinaryTree(nums, begin, end - 1);
		} else {
			root = new TreeNode(nums[index]);
			root.left = constructMaximumBinaryTree(nums, begin, index - 1);
			root.right = constructMaximumBinaryTree(nums, index + 1, end);
		}
		return root;
	}
	public static void main(String[] args) {
		int[] nums = {3,2,1,6,0,5};
		System.out.println(constructMaximumBinaryTree(nums));
	}
}
