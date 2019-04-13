package leetcode;

/**
 * @author jackpaul <jiekepao@gmail.com>
 * Created on 2019-04-13 21:04
 * @Description:
 */
public class P623 {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if(d == 1) {
            TreeNode node = new TreeNode(v);
            node.left = root;
            return node;
        }
        helper(root, v, d, 1);
        return root;
    }

    private void helper(TreeNode root, int v, int d, int level) {
        if(root == null || level > d - 1) {
            return;
        } else if(level == d - 1) {
            TreeNode left = root.left;
            root.left = new TreeNode(v);
            root.left.left = left;

            TreeNode right = root.right;
            root.right = new TreeNode(v);
            root.right.right = right;

        } else {
            helper(root.left, v, d, level+1);
            helper(root.right, v, d, level+1);
        }
    }

}
