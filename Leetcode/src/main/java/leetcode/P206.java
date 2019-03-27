package leetcode;


public class P206 {

	public ListNode reverseList(ListNode head) {
		if(head.next == null)
			return null;
	       ListNode currentNode = head; 
	       ListNode lastNode = null;
	       ListNode lastNodeBak = null;
	       while(currentNode.next != null) {
	    	   currentNode = currentNode.next;
	       }
	       lastNode = currentNode;
	       lastNodeBak = lastNode;
	       
	       currentNode = head;
	       head = head.next;
	       currentNode.next = null;
	       lastNode.next = currentNode;

//	       while(head != null && head != lastNodeBak) {
//	    	   currentNode = head;
//	    	   head = head.next;
//	    	   currentNode.next = null;
//	           lastNode.next = currentNode;
//	           lastNode = currentNode;
//	           currentNode = currentNode.next;
//	       }
	       
	       return head;
	    }

}
