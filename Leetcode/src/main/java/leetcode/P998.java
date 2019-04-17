package leetcode;

import java.util.LinkedList;

/**
 * @author jackpaul <jiekepao@gmail.com>
 * Created on 2019-04-14 9:36
 * @Description:
 */
public class P998 {
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        if(root == null) {
            return new TreeNode(val);
        }
        if(root.val < val) {
            TreeNode node = new TreeNode(val);
            node.left = root;
            return node;
        }
        if(root.right == null) {
            root.right = new TreeNode(val);
            return root;
        }
        root.right = insertIntoMaxTree(root.right, val);
        return root;
    }


}
