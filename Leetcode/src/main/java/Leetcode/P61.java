package medium;

public class P61 {
    public ListNode rotateRight(ListNode head, int k) {
    	int len = 0;
    	ListNode curr = head;
    	ListNode pre = null;
    	while(curr != null) {
    		len++;
    		pre = curr;
    		curr = curr.next;
    	}
    	
    	if(k % len == 0)
    		return head;
    	else
    		k = k % len;
    	pre.next = head;
    	
    	int i = 0;
    	pre = head;
    	while(i < k) {
    		pre = pre.next;
    		i++;
    	}
    	curr = pre.next;
    	pre.next = null;
    	head = curr;
    	return head;
    }
}
