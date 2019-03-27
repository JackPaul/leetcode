package leetcode;

public class P82 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next  == null)
        	return head;
        
        ListNode root = new ListNode(0);

        ListNode current = head.next;
        ListNode pre = root;
        
        int v = head.val;
        
        while(current != null && head.val == current.val) {
        	while(current != null && current.val == v) {
        		current = current.next;
        	}
            if(current == null)
        		return null;
        	head = current;
        	current = head.next;
        	v = head.val;
        }
        root.next = head;
        current = head.next;
        pre = head;
        while(current != null && current.next != null) {
        	if(current.val == current.next.val) {
        		while(current.next != null && current.val == current.next.val) {
        			current = current.next;
        		}
        		current = current.next;
        		pre.next = current;
        		
        	} else {
            	pre = current;
            	current = current.next;
        	}
        }  
        return root.next;
    }
}
