package medium;

import java.util.HashMap;
import java.util.Map;

public class P146 {

	static class LRUCache {
	    class ListNode {
	        public int key;
	        public int value;
	        public ListNode pre;
	        public ListNode next;
	        
	        public ListNode(int key, int val) {
	        	this.key = key;
	        	this.value = val;
	        }
	    }
	    
	    int capacity;
	    int size = 0;
	    Map<Integer, ListNode> map;
	    ListNode head = null;
	    ListNode tail = null;
	    
	    public LRUCache(int capacity) {
	    	this.capacity = capacity;
	        map = new HashMap<Integer, ListNode>();
	    }
	    
	    public int get(int key) {
	    	int res = -1;
	        if(map.containsKey(key)) {
	        	ListNode node = map.get(key);
	        	res = node.value;
	        	if(node != head) {
	        		if(node == tail)
	        			tail = tail.pre;
		        	if(node.pre != null)
		        		node.pre.next = node.next;
		        	if(node.next != null)
		        		node.next.pre = node.pre;
		        	node.next = head;
		        	head.pre = node;
		        	head = node;
	        	}
	        	map.put(key, node);
	        }
	    	return res;
	    }
	    
	    public void put(int key, int value) {
            if(size == 0) {
                ListNode node = new ListNode(key, value);
                head = node;
                tail = node;
                size++;
                map.put(key, node);
                return;
            }
	        if(map.containsKey(key)) {
	        	ListNode node = map.get(key);
	        	node.value = value;
	        	if(node != head) {
	        		if(node == tail)
	        			tail = tail.pre;
		        	if(node.pre != null)
		        		node.pre.next = node.next;
		        	if(node.next != null)
		        		node.next.pre = node.pre;
		        	node.next = head;
		        	head.pre = node;
		        	head = node;
	        	}
	        	map.put(key, node);
	        } else {
		        ListNode node = new ListNode(key, value);
		        node.next = head;
		        head.pre = node;
	            head = node;
		        map.put(key, node);
		        size++;
		        if(size > capacity) {
		        	ListNode t = tail;
		        	tail.pre.next = null;
		        	tail = tail.pre;
		        	t.pre = null;
		        	map.remove(t.key);
		        	size--;
		        }
	        } 	
	    }
	}
	
	public static void main(String[] args) {
		 LRUCache obj = new LRUCache(2);
		 obj.put(2,1);
		 
		 obj.put(1,2);
		 obj.put(2,3);
		 obj.put(4,1);
		 System.out.println(obj.get(1));
		 System.out.println(obj.get(2));
		 obj.put(4,4);
//		 System.out.println(obj.get(1));
//		 System.out.println(obj.get(3));
//		 System.out.println(obj.get(4));
//		 System.out.println("hah");
		 
	}

}
