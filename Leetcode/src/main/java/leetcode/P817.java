package leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class P817 {
    public int numComponents(ListNode head, int[] G) {
        
    	int res = 0;
        Arrays.sort(G); 
        List<Integer> pos = new ArrayList<>();
        int count = 0;
        ListNode cur = head;
        while(cur != null) {
        	pos.add(count++, Arrays.binarySearch(G, cur.val));
        	cur = cur.next;
        }
        
        System.out.println(pos);
        
        int i = 0;
        boolean flag = false;
        while(i < pos.size()) {
        	if(!flag) {
        		if(pos.get(i) >= 0) {
        			res++;
        			flag = true;
        		}
        	}
        	else {
        		if(pos.get(i) < 0) {
        			flag = false;
        		}
        	}
        	i++;
        }
        return res;
    }
}
