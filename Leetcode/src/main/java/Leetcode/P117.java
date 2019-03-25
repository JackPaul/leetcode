package medium;

import medium.P116.TreeLinkNode;

public class P117 {

    public void connect(TreeLinkNode root) {
        if(root == null)
        	return;
        TreeLinkNode n = root.next;
        if(n != null) {
        	while(n != null && n.left == null && n.right == null) {
        		n = n.next;
        	}
        }
        if(root.left != null) {
        	if(root.right != null) {
        		root.left.next = root.right;
        		if(n != null) {
        			if(n.left != null) {
        				root.right.next = n.left;
        			} else {
        				root.right.next = n.right;
        			}
        		}
        	}
        	else {
        		if(n != null) {
        			if(n.left != null) {
        				root.left.next = n.left;
        			} else {
        				root.left.next = n.right;
        			}
        		}
        	}
        	
        } else if(root.right != null){
    		if(n != null) {
    			if(n.left != null) {
    				root.right.next = n.left;
    			} else {
    				root.right.next = n.right;
    			}
    		}
    		
        }
        connect(root.right);
        connect(root.left);  
    }

}
