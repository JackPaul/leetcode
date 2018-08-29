package easy;

public class P530 {
	 
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	

    public static int getMinimumDifference(TreeNode root) {
        if(root == null)
        	return Integer.MAX_VALUE;
        
        
    	int leftMax = 0;
    	int rightMin = 0;
    	TreeNode current = null;
    	if(root.left == null)
    		leftMax = Integer.MIN_VALUE;
    	else {
    		current = root.left;
    		while(current.right != null)
    			current = current.right;
    		
    		leftMax = current.val;
    	}
    	
    	if(root.right == null)
    		rightMin = Integer.MAX_VALUE;
    	else {
    		current = root.right;
    		while(current.left != null)
    			current = current.left;
    		rightMin = current.val;
    	}
    	//Math.abs()   	
    	return leftMax==Integer.MIN_VALUE?min(Math.abs(rightMin - root.val), getMinimumDifference(root.left), getMinimumDifference(root.right)):min(Math.abs(root.val - leftMax), Math.abs(rightMin - root.val), getMinimumDifference(root.left), getMinimumDifference(root.right));       	 
    }
    
    public static int min(int...values) {
		int min = values[0];
		for(int v : values) {
			if(v < min) {
				min = v;
			}
		}
    	return min; 	
    }
    
    public static void main(String[] args) {
		P530 p = new P530();
		TreeNode node1 = p.new TreeNode(1);
		node1.right = p.new TreeNode(3);
		node1.right.left = p.new TreeNode(2);
		System.out.println(getMinimumDifference(node1));
		//syso
	}


}
