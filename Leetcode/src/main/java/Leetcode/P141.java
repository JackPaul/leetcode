package easy;

import java.util.ArrayList;
import java.util.List;

public class P141 {

    public boolean hasCycle(ListNode head) {
       	if(head == null)
       		return false;
    	while(head != null && head.next != null && head.next != head) {
            head.next = head.next.next;
    		head = head.next;
    	}
    	if(head == null)
            return false;
    	return head.next == head;
    }

}
