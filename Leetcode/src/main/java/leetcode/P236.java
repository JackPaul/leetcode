package leetcode;

import java.util.LinkedList;

/**
 * @author jackpaul <jiekepao@gmail.com>
 * Created on 2019-04-13 21:35
 * @Description:
 */
public class P236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) {
            return null;
        }
        LinkedList<TreeNode> nodes = new LinkedList<>();
        nodes.push(root);
        TreeNode res = null;
        while(!nodes.isEmpty()) {
            TreeNode node = nodes.pop();
            if(isAncestor(node, p) && isAncestor(node, q)){
                res = node;
            }
            if(node.right != null) {
                nodes.push(node.right);
            }
            if(node.left != null) {
                nodes.push(node.left);
            }
        }
        return res;
    }

    private boolean isAncestor(TreeNode node1, TreeNode node2) {
        if(node1 == node2) {
            return true;
        }
        if(node1 == null) {
            return false;
        }
        return isAncestor(node1.left, node2) || isAncestor(node1.right, node2);
    }
}
