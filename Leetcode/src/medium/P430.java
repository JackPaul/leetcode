package medium;


class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public Node() {}

    public Node(int _val,Node _prev,Node _next,Node _child) {
        val = _val;
        prev = _prev;
        next = _next;
        child = _child;
    }
}

public class P430 {

    public Node flatten(Node head) {
    	if(head == null)
    		return head;
    	if(head.child != null) {
        	Node r = flatten(head.next);
        	Node flatten = flatten(head.child);
        	Node c = flatten;
        	while(c.next != null) {
        		c = c.next;
        	}
        	head.next = flatten;
        	if(flatten != null)
        		flatten.prev = head;
        	c.next = r;
        	if(r != null)
        		r.prev = c;
        	head.child = null;
        } else {
        	Node flatten  = flatten(head.next);
        	head.next = flatten;
        	if(flatten != null)
        		flatten.prev = head;
        }
        return head;
    }   	
}
