package leetcode;

public class P707 {
	class ListNode {
		private int val = 0;
		private ListNode next = null;
		
		public ListNode(int val) {
			this.val = val;
			this.next = null;
		}
	}
	class MyLinkedList {
		
	    ListNode root;
	    

	    /** Initialize your data structure here. */
	    public MyLinkedList() {
	        root = null;
	    }
	    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
	    public int get(int index) {
	        if(this.root == null) {
	        	return -1;
	        }else {
	        	int i = 0;
	        	ListNode current = root;
	        	while(current != null && i < index)
	        	{
	        		i++;
	        		current = current.next;
	        	}
	        		
	        	
	        	if(current == null)
	        		return -1;
	        	else
	        		return current.val;
	        }
	    }
	    
	    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
	    public void addAtHead(int val) {
	        ListNode node = new ListNode(val);
	        node.next = root;
	        root = node;
	    }
	    
	    /** Append a node of value val to the last element of the linked list. */
	    public void addAtTail(int val) {
        	ListNode current = root;
        	while(current.next != null)
        		current = current.next;
        	
        	current.next = new ListNode(val);
	    }
	    
	    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
	    public void addAtIndex(int index, int val) {
	
        	if(index == 0) {
        		addAtHead(val);
        		return;
        	}
        	
        	if(root == null)
        		return;
        	int i = 1;
        	ListNode pre = null;
        	ListNode current = root;
        	while(current.next != null && i < index) {
        		pre = current;
        		current = current.next;
        		i++;
        	}
        	
        	if(i == index && current.next == null) {
        		current.next = new ListNode(val);
        		return;
        	}
        	
        	if(i == index && current.next != null) {
        		ListNode node = new ListNode(val);
        		node.next = current.next;
        		current.next = node;
        		//pre.next = node;
        	}

	    }
	    
	    /** Delete the index-th node in the linked list, if the index is valid. */
	    public void deleteAtIndex(int index) {
	    	if(this.root == null) {
	        	return;
	        }else {
	        	int i = 0;
	        	if(index == 0) {
	        		root = root.next;
	        	}
	        	ListNode pre = null;
	        	ListNode current = root;
	        	while(current.next != null && i < index) {
	        		pre = current;
	        		current = current.next;
	        		i++;
	        	}
	        	if(i == index) {
	        		pre.next = current.next;
	        	} 
	        }
	    }
	    
	    public void print() {
	    	ListNode node = root;
	    	while(node != null) {
	    		System.out.print(node.val+" ");
	    		node = node.next;
	    	}
	    	System.out.println("******");
	    }
	}

	/**
	 * Your MyLinkedList object will be instantiated and called as such:
	 * MyLinkedList obj = new MyLinkedList();
	 * int param_1 = obj.get(index);
	 * obj.addAtHead(val);
	 * obj.addAtTail(val);
	 * obj.addAtIndex(index,val);
	 * obj.deleteAtIndex(index);
	 */
	public static void main(String[] args) {
		P707 p = new P707();
		MyLinkedList linkedList = p.new MyLinkedList();
//		linkedList.addAtHead(1);
//		linkedList.print();
//		linkedList.addAtTail(3);
//		linkedList.print();
//		linkedList.addAtIndex(1, 2);  // linked list becomes 1->2->3
//		linkedList.print();
//		linkedList.get(1);            // returns 2
//		linkedList.deleteAtIndex(1);  // now the linked list is 1->3
//		linkedList.print();
//		linkedList.get(1);            // returns 3
		
//		["MyLinkedList","get","addAtIndex","get","get","addAtIndex","get","get"]
//				[[],[0],[1,2],[0],[1],[0,1],[0],[1]]
		System.out.println(linkedList.get(0));
		linkedList.print();
		linkedList.addAtIndex(1,2);
		linkedList.print();
		System.out.println(linkedList.get(0));
		linkedList.print();
		System.out.println(linkedList.get(1));
		linkedList.print();
		linkedList.addAtIndex(0,1);
		linkedList.print();
		System.out.println(linkedList.get(0));
		linkedList.print();
		System.out.println(linkedList.get(1));
		linkedList.print();
		
	}
}
