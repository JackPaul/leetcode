package leetcode;

import java.util.ArrayList;
import java.util.List;


public class P653 {
	
	class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	}
	
    public static boolean findTarget(TreeNode root, int k) {
    	if(root == null)
    		return false;
    	if(root.val == k)
        	return false;

        if(k - root.val == root.val){
            return false;
        } else{

            //遍历二叉树
            List<Integer> list = new ArrayList<>();
            postVisit(root, list);
            for(int i = 0; i < list.size(); i++) {
                if(list.indexOf(k - list.get(i)) != -1 && list.indexOf(k - list.get(i)) != i) {
                    return true;
                }
            }	
            return false;

        }
    }
    
    public static void postVisit(TreeNode root, List<Integer> list) {
    	if(root == null)
    		return;
    	postVisit(root.left, list);
    	list.add(root.val);
    	postVisit(root.right, list);
    }
    
    public static void main(String[] args) {
    	P653 p = new P653();
		TreeNode node5 = p.new TreeNode(5);
		TreeNode node3 = p.new TreeNode(3);
		TreeNode node6 = p.new TreeNode(6);
		TreeNode node2 = p.new TreeNode(2);
		TreeNode node4 = p.new TreeNode(4);
		TreeNode node7 = p.new TreeNode(7);
		
		node3.left = node2;
		node3.right = node4;
		node4.right = node7;
		node5.left = node3;
		node5.right = node6;
		
		System.out.println(findTarget(node5, 9));
	}

}
