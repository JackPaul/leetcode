package medium;

public class P2 {
	public class ListNode {
		  int val;
		  ListNode next;
		  ListNode(int x) { val = x; }
	}
	
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l1_copy = l1;
        ListNode currentNode = null;
        
        int flag = 0;
        int total = 0;
        while(l1.next != null && l2.next != null) {
        	total = l1.val + l2.val + flag;
        	l1.val = total % 10;
        	flag = total / 10;
        	l1 = l1.next;
        	l2 = l2.next;
        }
        
    	total = l1.val + l2.val + flag;
    	l1.val = total % 10;
    	flag = total / 10;
        if(l1.next == null && l2.next == null) {
        	if(flag > 0) {
        		l1.next = new ListNode(flag);
        	}
        } else {
        	if(l1.next == null && l2.next != null) {
            	l1.next = l2.next;
            }
        	currentNode = l1.next;
        	if(flag > 0) {
        		while(currentNode.next != null) { 
        			total = flag + currentNode.val;
        			currentNode.val = total % 10;
        			flag = total / 10;
        			currentNode = currentNode.next;
        		}
    			total = flag + currentNode.val;
    			currentNode.val = total % 10;
    			flag = total / 10;
    			if(flag > 0)
    				currentNode.next = new ListNode(flag);
        	}
        }	
        return l1_copy;
    }
}
