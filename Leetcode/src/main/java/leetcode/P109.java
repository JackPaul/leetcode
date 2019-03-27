package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P109 {
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> nums = new ArrayList<>();
        ListNode cur = head;
        while(cur != null) {
        	nums.add(cur.val);
        	cur = cur.next;
        }
        
        return sortedListBst(nums, 0, nums.size()-1);
    }

	private TreeNode sortedListBst(List<Integer> nums, int i, int j) {
		if(i > j)
			return null;
		if(i == j) {
			return new TreeNode(nums.get(i));
		}
		
		if(i == j - 1) {
			TreeNode node1 = new TreeNode(nums.get(i));
			TreeNode node2 = new TreeNode(nums.get(j));
			node2.left = node1;
			return node2;
		}
		
		int center = (i + j) / 2;
		TreeNode root = new TreeNode(nums.get(center));
		root.right = sortedListBst(nums, center+1, j);
		root.left = sortedListBst(nums, i, center-1);
		return root;
	}
}
