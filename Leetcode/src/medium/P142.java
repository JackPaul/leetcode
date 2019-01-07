package medium;

public class P142 {

    public static ListNode detectCycle(ListNode head) {
    	int circleLen = hasCircle(head);
        if(circleLen == 0) {
        	return null;
        }
        
        ListNode cur = head;
        while(circleLen > 1) {
        	cur = cur.next;
        	circleLen--;
        }
        //System.out.println(head.val +" "+cur.val);
        while(cur.next != head) {
        	cur = cur.next;
        	head = head.next;
        }
        return head;
    }
    
    //返回circle长度  若没有环  返回0
    public static int hasCircle(ListNode head) {
    	ListNode slow = head;
    	ListNode fast = head.next;
    	while(slow != null && head != null && slow != fast) {
    		slow = slow.next;
    		fast = fast.next;
    		if(fast != null)
    			fast = fast.next;
    	}
    	
    	//有环
    	if(fast == slow) {
    		int i= 1;
    		fast = fast.next;
    		while(fast != slow) {
    			i++;
    			fast = fast.next;
    		}
    		return i;
    	}
    	//无环
    	return 0;
    }
    
    public static void main(String[] args) {
		ListNode l1 = new ListNode(3);
		ListNode l2 = new ListNode(3);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(3);
		l1.next = l2;l2.next = l3;l3.next = l4;l4.next = l2;
		System.out.println(detectCycle(l1));
		//System.out.println(hasCircle(l2));
		
	}

}
