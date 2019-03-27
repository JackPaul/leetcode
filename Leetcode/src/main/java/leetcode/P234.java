package leetcode;
import java.util.ArrayList;
import java.util.List;

public class P234 {

    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head != null) {
        	list.add(head.val);
        	head = head.next;
        }
        
        int i = 0, j = list.size() - 1;
        while(i < j) {
        	if(!list.get(i).equals(list.get(j)))
        		return false;
        	i++;j--;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);list.add(1);
		System.out.println(list.get(1) == list.get(0));
	}

}
