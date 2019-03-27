package leetcode;

public class P147 {
    public static ListNode insertionSortList(ListNode head) {
    	if(head == null)
    		return null;
        ListNode res = new ListNode(-1);
        res.next = head;
        ListNode head2 = head.next;
        head.next = null;
        
        ListNode cur = null;
        
        ListNode cur1 = res.next;
        ListNode pre = res;
        while(head2 != null) {
        	
        	cur = head2;
        	head2 = head2.next;
        	cur.next = null;
        	cur1 = res.next;
        	pre = res;
        	while(cur1 != null && cur1.val < cur.val) {
        		pre = cur1;
        		cur1 = cur1.next;
        	}
    		cur.next = pre.next;
    		pre.next = cur;
        	
        }
        
        return res.next;
    }
    
    public static void main(String[] args) {
		ListNode l1 = new ListNode(-1);
		ListNode l2 = new ListNode(5);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(0);
//		ListNode l6 = new ListNode(6);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
//		l5.next = l6;
		insertionSortList(l1);
    }
}
