package leetcode;

import java.util.LinkedList;

/**
 * @author jackpaul <jiekepao@gmail.com>
 * Created on 2019-04-13 21:58
 * @Description:
 */
public class P993 {
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null) {
            return false;
        }
        TreeNode node1 = find(root, x);
        TreeNode node2 = find(root, y);
        if(depthHelper(root,  x,0) != depthHelper(root, y,0))
            return false;
        LinkedList<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            TreeNode node = nodes.pop();
            if(node.left != null && node.right!= null) {
                if(((node.left.val == x && node.right.val == y) || (node.left.val == y && node.right.val == x)))
                    return false;
            }
            if(node.left != null) {
                nodes.push(node.left);
            }
            if(node.right != null) {
                nodes.push(node.right);
            }

        }
        return true;
    }

    public TreeNode find(TreeNode root, int x) {
        if(root == null) {
            return null;
        }
        if(root.val == x) {
            return root;
        }
        TreeNode node = find(root.left, x);
        if(node != null) {
            return node;
        }
        return find(root.right, x);
    }


    private int depthHelper(TreeNode root, int val, int d) {
        if(root == null) {
            return -1;
        }

        if(root.val == val) {
            return d;
        }
        return Integer.max(depthHelper(root.left, val, d+1), depthHelper(root.right, val, d+1));
    }
}
