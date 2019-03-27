package leetcode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P138 {
	  class RandomListNode {
		      int label;
		      RandomListNode next, random;
		      RandomListNode(int x) { this.label = x; }
		  };
    public RandomListNode copyRandomList(RandomListNode head) {
    	RandomListNode res = new RandomListNode(-1);
    	RandomListNode pre = res;
    	Map<RandomListNode, Integer> map = new HashMap<>();
    	List<RandomListNode> copyNodes = new ArrayList<>();
    	RandomListNode cur = head;
    	int index = 0;
    	while(cur != null) {
    		System.out.println(cur.label);
    		map.put(cur, index++);
    		RandomListNode copyNode = new RandomListNode(cur.label);
    		copyNodes.add(copyNode);
    		pre.next = copyNode;
    		pre = pre.next;
    		cur = cur.next;
    	}
    	
    	
    	cur = head;
    	RandomListNode cur2 = res.next;
    	while(cur != null) {
    		if(cur.random != null)
    			cur2.random = copyNodes.get(map.get(cur.random));
    		cur = cur.next;
    		cur2 = cur2.next;
    	} 	
    	return res.next;
    }
}
