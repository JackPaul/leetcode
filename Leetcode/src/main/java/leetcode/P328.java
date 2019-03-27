package leetcode;

public class P328 {

    public ListNode oddEvenList(ListNode head) {
    	if(head == null)
    		return null;
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode last = head;
        ListNode newHead = head.next;
        ListNode pre = newHead;
        if(newHead == null)
        	return head;
        ListNode cur =  newHead.next;
        while(cur != null) {
        	last.next = cur;
        	last = cur;
        	pre.next = cur.next;
        	pre = pre.next;
        	if(pre == null)
        		break;
        	cur = pre.next;
        }
        last.next = newHead;
        return res.next;
    }

}
