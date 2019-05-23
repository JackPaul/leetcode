package leetcode;

/**
 * @author jackpaul <jiekepao@gmail.com>
 * Created on 2019-04-14 10:14
 * @Description:
 */
public class P988 {
    public String smallestFromLeaf(TreeNode root) {
        String[] res = new String[1];
        travel(root, res, "");
        return res[0];
    }

    private void travel(TreeNode root, String[] res, String current) {
        if(root == null) {
            return ;
        }
        current = (char) (root.val + 'a') + current;
        if(root.left == null && root.right == null) {
            if(res[0] == null) {
                res[0] = current;
            } else {
                if(current.compareTo(res[0]) < 0) {
                    res[0] = current;
                }
            }
            return;
        }
        travel(root.left, res, current);
        travel(root.right, res, current);
    }
}
