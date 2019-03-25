package medium;

public class P24 {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
    public ListNode swapPairs(ListNode head) {
       if(head == null || head.next == null)
    	   return head;
       ListNode preNode=null, currentNode=null;
       ListNode res=null;
       preNode = head;
       currentNode = preNode.next;
       if(currentNode != null) {
       	preNode.next = swapPairs(currentNode.next);
       	currentNode.next = preNode;
       	res = currentNode;
       }  
       return res;
    }
}
