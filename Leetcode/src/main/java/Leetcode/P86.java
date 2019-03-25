package medium;

public class P86 {
    public ListNode partition(ListNode head, int x) {
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode cur = head;
        ListNode pre = head;
        ListNode tail = res;
        while(cur != null && head != null) {
        	if(cur.val >= x) {
        		pre = cur;
        		cur = cur.next;
        	} else {
        		if(cur == head) {
        			tail = tail.next;
        			pre = cur;
        			cur = cur.next;
        			if(cur != null)
        				head = cur;
        			else
        				break;
        		}
        		else {
            		ListNode c = tail.next;
            		tail.next = cur;
            		tail = cur;
            		pre.next = cur.next;
            		cur = cur.next;
            		tail.next = c;
        		}

        	}
        }   
        return res.next;
    }
}
