package medium;

public class P725 {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] res = new ListNode[k];
        int[] nums = new int[k];
        int len = 0;
        ListNode cur = root;
        while(cur != null) {
        	len++;
        	cur = cur.next;
        }
        
        int count = 0;
        cur = root;
    	ListNode pre = cur;
        if(len <= k) {
        	while(cur != null) {
        		res[count++] = cur;
        		pre = cur;
        		cur = cur.next;
        		pre.next = null;
        	}	
        } else {
        	int a = len % k;
        	int b = len / k;
        	for(int i = 0; i < k; i++) {
        		nums[i] = b;
        		if(a > 0) {
        			nums[i]++;
        			a--;
        		}
        			
        	}

        	for(int i = 0; i < k; i++) {
        		int n = 0;
        		res[i] = cur;
        		while(n < nums[i]) {
        			pre = cur;
        			cur = cur.next;
        			n++;
        		}
        		pre.next = null;
        	}
        }
        return res;
    }
}
