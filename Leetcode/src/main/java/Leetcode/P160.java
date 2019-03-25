package easy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class P160 {

	/*
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currentNode = headA;
        ListNode res = null;
        
        while(headA != null) {
        	if(contains(headB, headA))
        		return headA;
        	headA = headA.next;
        }
        return res;
    }

	private boolean contains(ListNode headB, ListNode headA) {
		
        while(headB != null) {
        	if(headB == headA)
        		return true;
        	headB = headB.next;
        }
		return false;
	}
	*/
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		int lenA = 0, lenB = 0;
		ListNode headA1 = headA, headB1 = headB;
        while(headA1 != null) {
        	lenA++;
        	headA1 = headA1.next;
        }
        while(headB1 != null) {
        	lenB++;
        	headB1 = headB1.next;
        }
        
        if(lenA > lenB) {
        	for(int i = 0; i < lenA - lenB; i++)
        		headA = headA.next;
        	
        } else {
        	for(int i = 0; i < lenB - lenA; i++)
        		headB = headB.next;
        }
        
        while(headA != null && headB != null) {
        	if(headA == headB)
        		return headA;
        	headA = headA.next;
        	headB = headB.next;
        }
        
        return null;
	}
}
