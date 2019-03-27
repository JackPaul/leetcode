package leetcode;

public class P92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
    	if(m == n) {
    		return head;
    	}
        ListNode res = new ListNode(0);
        
        res.next = head;
        
        ListNode pre = res;
        ListNode cur = head;
        int i = 1;
        while(i < m && cur != null) {
        	pre = cur;
        	cur = cur.next;
        	i++;
        }
        
        ListNode tail = pre;//����ǰ�벿�ֵ�β�ڵ�
        ListNode p = cur;
        ListNode p1 = cur;
        cur = cur.next;
        
        while(i < n && cur != null) {
        	p1.next = cur.next;
        	cur.next = p;
        	p = cur;
        	cur = p1.next;
        	i++;
        }
        
        tail.next = p;
        return res.next;
    }
}
