package leetcode;

/**
 * @author jackpaul <jiekepao@gmail.com>
 * Created on 2019-04-13 21:26
 * @Description:
 */
public class P222 {
    public int countNodes(TreeNode root) {
        int[] res = new int[1];
        helper(root, res);
        return res[0];
    }

    private void helper(TreeNode root, int[] res) {
        if(root == null) {
            return;
        }
        res[0]++;
        helper(root.left, res);
        helper(root.right, res);
    }
}
