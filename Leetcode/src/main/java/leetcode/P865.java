package leetcode;

import java.util.Map;

/**
 * @author jackpaul <jiekepao@gmail.com>
 * Created on 2019-06-16 15:35
 * @Description: @link https://leetcode.com/problems/smallest-subtree-with-all-the-deepest-nodes/
 * Given a binary tree rooted at root, the depth of each node is the shortest distance to the root.
 *
 * A node is deepest if it has the largest depth possible among any node in the entire tree.
 *
 * The subtree of a node is that node, plus the set of all descendants of that node.
 *
 * Return the node with the largest depth such that it contains all the deepest nodes in its subtree.
 */
public class P865 {
    //实际上是求最低的非叶节点，其左右子树高度相同
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if (root == null) {
            return root;
        }
        int l = depth(root.left, 0);
        int r = depth(root.right, 0);
        if(l == r) {
            return root;
        } else if(l > r){
            return subtreeWithAllDeepest(root.left);
        } else {
            return subtreeWithAllDeepest(root.right);
        }
    }

    private int depth(TreeNode root, int currentDepth) {
        if(root == null) {
            return currentDepth;
        }
        return Math.max(depth(root.right, currentDepth+1), depth(root.left, currentDepth+1));
    }

}
