package leetcode;

public class P143 {
    public static void reorderList(ListNode head) {
        int n = 0;
        ListNode cur = head;
        ListNode pre2 = null;
        ListNode change = null;
        while(cur != null) {
        	n++;
        	cur = cur.next;
        }
        int i = 1;//λ��
        int l = n / 2;
        cur = head;
        int step = 1 + n - 2 * i;
        while(i <= l) {
        	System.out.println(cur.val);
        	change = cur;
        	pre2 = null;
        	int j = step;
    		while(j > 0) {
    			pre2 = change;
    			change = change.next;
    			j--;
    		}
        	step -= 2;
        	pre2.next = change.next;
        	change.next = cur.next;
        	cur.next = change;
        	i++;
        	cur = cur.next.next;
        }
    }
    
    public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		ListNode l6 = new ListNode(6);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		reorderList(l1);
    }
}
