package easy;

public class P563 {

	public int findTilt(TreeNode root) {
		
		if(root == null)
			return 0;
		if(root.left == null && root.right == null)     { 
			return 0;
		}
		
		int count = 0;
		if(root.left != null && root.right == null)     { 
			count =  Math.abs(sumOfTree(root.left));
		}  
		if(root.left == null && root.right != null)     { 
			count =  Math.abs(sumOfTree(root.right));
		}  
		if(root.left != null && root.right != null)     { 
			count =  Math.abs(sumOfTree(root.left) - sumOfTree(root.right));
		} 
		return count + findTilt(root.left) + findTilt(root.right);  
	}
	
	public int sumOfTree(TreeNode root) {
		if(root == null)
			return 0;
		else {
			return root.val + sumOfTree(root.left) + sumOfTree(root.right);
		}
	}
}
