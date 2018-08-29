package easy;

import java.util.ArrayList;
import java.util.List;

public class P872 {
	 class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
	 
	 public static void leafVisit(TreeNode root, List<Integer> leaves){
		  while(root != null) {
			  if(root.left == null && root.right == null) {
				  leaves.add(root.val);
			  } else if(root.left == null && root.right != null) {
				  leafVisit(root.right, leaves);
			  } else if(root.left != null && root.right == null) {
				  leafVisit(root.left, leaves);
			  } else {
				  leafVisit(root.left, leaves);
				  leafVisit(root.right, leaves);
			  }
		  }
	 }
	 public boolean leafSimilar(TreeNode root1, TreeNode root2) {
		 List<Integer> l1 = new ArrayList<>();
		 List<Integer> l2 = new ArrayList<>();
		 leafVisit(root1, l1);
		 leafVisit(root2, l2);
//		 if(l1.size() != l2.size()) {
//			 return false;
//		 } else {
//			 for(int i = 0; i <= l1.size(); i++) {
//				 if(l1.get(i) != l2.get(i)) {
//					 return false;
//				 }
//			 }
//			 return true;
//		 }
		 
		 return l1.equals(l2);
		 
	 }

}
