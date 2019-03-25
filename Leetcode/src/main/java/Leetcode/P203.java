package easy;

public class P203 {

    public ListNode removeElements(ListNode head, int val) {
        ListNode currentNode = head;
        ListNode preNode = null;
        while(currentNode != null) {
        	if(currentNode.val == val) {
        		if(preNode == null) {
        			head = currentNode.next;
        			currentNode = head;
        		} else {
        			preNode.next = currentNode.next;
        			currentNode = preNode.next;
        		}
        	} else {
        		preNode = currentNode;
        		currentNode = currentNode.next;
        	}
        }
        
        return head;
    }

}
