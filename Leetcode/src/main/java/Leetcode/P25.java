package hard;

public class P25 {

    public ListNode reverseKGroup(ListNode head, int k) {
        if(k <= 1 || head == null)
            return head;
        int  len = 0;
        ListNode cur = head;
        while(cur != null){
            len++;
            cur = cur.next;
        }
        return reverse(head, k, len);
    }
    
    public static ListNode reverse(ListNode head, int k,int len){
        if(head == null || k > len)
            return head;
        ListNode h = head;
        ListNode pre = head;
        ListNode cur = head.next;
        ListNode next = cur.next;
        int i = 1;
        while(i < k){
            next = cur.next;
            cur.next = h;
            pre.next = next;
            h = cur;
            cur = pre.next;
            i++;
        }
        pre.next = reverse(pre.next, k, len - k);
        return h;
    }

}
