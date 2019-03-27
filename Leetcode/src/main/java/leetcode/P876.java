package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P876 {
	class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	}
	
	public ListNode middleNode(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        int i = 0;
        while(head != null) {
        	list.add(head);
        	head = head.next;
        	i++;
        }
		return list.get(i/2);
    }

}
