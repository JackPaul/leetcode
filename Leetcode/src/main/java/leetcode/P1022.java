package leetcode;

/**
 * @author jackpaul <jiekepao@gmail.com>
 * Created on 2019-04-13 21:50
 * @Description:
 */
public class P1022 {
    public int sumRootToLeaf(TreeNode root) {
        int[] res = new int[1];

        helper(root, res, 0);
        return res[0];
    }

    private void helper(TreeNode root, int[] res, int currentSum) {
        if(root == null){
            return;
        }
        currentSum = (currentSum * 2 + root.val);
        if(root.left == null && root.right == null) {
            res[0] += currentSum;
        } else {
            helper(root.left, res, currentSum);
            helper(root.right, res, currentSum);
        }
    }
}
