package leetcode;

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 *  Example:
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */

public class P2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l1_copy = l1;
        ListNode currentNode = null;
        
        int flag = 0;
        int total = 0;
        while(l1.next != null && l2.next != null) {
        	total = l1.val + l2.val + flag;
        	l1.val = total % 10;
        	flag = total / 10;
        	l1 = l1.next;
        	l2 = l2.next;
        }
        
    	total = l1.val + l2.val + flag;
    	l1.val = total % 10;
    	flag = total / 10;
        if(l1.next == null && l2.next == null) {
        	if(flag > 0) {
        		l1.next = new ListNode(flag);
        	}
        } else {
        	if(l1.next == null && l2.next != null) {
            	l1.next = l2.next;
            }
        	currentNode = l1.next;
        	if(flag > 0) {
        		while(currentNode.next != null) { 
        			total = flag + currentNode.val;
        			currentNode.val = total % 10;
        			flag = total / 10;
        			currentNode = currentNode.next;
        		}
    			total = flag + currentNode.val;
    			currentNode.val = total % 10;
    			flag = total / 10;
    			if(flag > 0)
    				currentNode.next = new ListNode(flag);
        	}
        }	
        return l1_copy;
    }
}
