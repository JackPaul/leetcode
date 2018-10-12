package medium;

public class P19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode current = head;
        while(current != null) {
        	len++;
        	current = current.next;
        }
        
        if(n == len) {
        	return head.next;
        } else if(n < len) {
        	ListNode pre = head;
        	current = head;
        	
        	for(int i = 0; i < len - n; i++) {
        		pre = current;
        		current = current.next;
        	}
        	pre.next = pre.next.next;
        	return head;
        }
        return head;
    }
}
