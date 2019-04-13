package leetcode;

import java.util.Arrays;

/**
 * @author jackpaul <jiekepao@gmail.com>
 * Created on 2019-04-13 23:15
 * @Description:
 */
public class P1008 {
    //8,5,1,7,10,12
    //1 5 7 8 10, 12
    public TreeNode bstFromPreorder(int[] preorder) {
        int[] inOrder = Arrays.copyOfRange(preorder, 0, preorder.length);
        Arrays.sort(inOrder);
        return constructTree(preorder, 0, preorder.length - 1, inOrder, 0, inOrder.length - 1);
    }

    private TreeNode constructTree(int[] preorder, int i, int j, int[] inOrder, int i1, int j1) {
        if(i > j || i1 > j1 || i < 0 || i1 < 0 || j >= preorder.length || j1 >= inOrder.length) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[i]);
        int pos = Arrays.binarySearch(inOrder, i1, j1 + 1, preorder[i]);
        root.left = constructTree(preorder, i + 1, i + (pos - i1), inOrder, i1, pos - 1);
        root.right = constructTree(preorder, i + (pos - i1) + 1, j, inOrder, pos + 1, j1);
       return root;
    }
}
