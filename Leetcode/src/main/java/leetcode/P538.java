package leetcode;

import java.util.ArrayList;
import java.util.List;


public class P538 {
	
	public static TreeNode convertBST(TreeNode root) {
		List<TreeNode> list = new ArrayList<>();
		List<Integer> listNum = new ArrayList<>();
		postVisit(root, list, listNum);
		//
		for(int i = 0; i < list.size(); i++) {
			int add = 0;
			for(int j = i+1; j < list.size(); j++) {
				if(list.get(i).val  < list.get(j).val) {
					add += list.get(j).val;
				}
			}
			list.get(i).val += add;
		}
		return root;
    }

	public static void postVisit(TreeNode root, List<TreeNode> list, List<Integer> listNum) {
		if(root != null) {
			postVisit(root.left, list, listNum);
			list.add(root);
			listNum.add(root.val);
			postVisit(root.right, list, listNum);
		}
		
	}
	
	public static void main(String[] args) {
		TreeNode node2 =  new TreeNode(2);
		node2.left = new TreeNode(1);
		node2.right = new TreeNode(3);
		convertBST(node2);
	}
	
	

}
