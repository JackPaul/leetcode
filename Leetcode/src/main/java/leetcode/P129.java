package leetcode;

public class P129 {
    public int sumNumbers(TreeNode root) {
        int[] res = new int[1];
        sumNumbers(root, res, 0);
        return res[0];
    }

	private void sumNumbers(TreeNode root, int[] res, int total) {
		if(root == null)
			return;
		if(root.left == null && root.right == null) {
			res[0] = res[0] + total * 10 + root.val;
		} else {
			sumNumbers(root.left, res, total * 10 + root.val);
			sumNumbers(root.right, res, total * 10 + root.val);
		}
	}
}
