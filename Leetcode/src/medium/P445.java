package medium;

import java.util.LinkedList;

public class P445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode res = new ListNode(0);
        LinkedList<Integer> s1 = new LinkedList<>();
        LinkedList<Integer> s2 = new LinkedList<>();
        
        ListNode cur = l1;
        while(cur != null) {
        	s1.push(cur.val);
        	cur = cur.next;
        }
        cur = l2;
        while(cur != null) {
        	s2.push(cur.val);
        	cur = cur.next;
        }
        //System.out.println(s1);
        int flag = 0;
        int a = 0, b = 0;
        int sum = 0;
        ListNode node = null;
        while((!s1.isEmpty()) && (!s2.isEmpty())) {
        	sum = s1.pop() + s2.pop() + flag;
        	a = sum / 10;
        	b = sum % 10;
    		node = new ListNode(b);
    		node.next = res.next;
    		res.next = node;
        	flag = a;
        }
        
        if(s1.isEmpty() && !s2.isEmpty()) {
        	while(!s2.isEmpty()) {
        		sum = s2.pop() + flag;
            	a = sum / 10;
            	b = sum % 10;
        		node = new ListNode(b);
        		node.next = res.next;
        		res.next = node;
            	flag = a;
        	}
        }
        if(s2.isEmpty() && !s1.isEmpty()){
        	while(!s1.isEmpty()) {
        		sum = s1.pop() + flag;
            	a = sum / 10;
            	b = sum % 10;
        		node = new ListNode(b);
        		node.next = res.next;
        		res.next = node;
            	flag = a;
        	}
        }

    	if(flag > 0) {
    		node = new ListNode(flag);
    		node.next = res.next;
    		res.next = node;
    	}
        return res.next;
    }
    
    
}
