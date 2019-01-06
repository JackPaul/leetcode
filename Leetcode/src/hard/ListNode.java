package hard;

public class ListNode {
	 int val;
	 ListNode next;
	 ListNode(int x) { val = x; }
	@Override
	public String toString() {
		String res = ""+val;
		ListNode cur = next;
		while(cur != null) {
			res+=" "+cur.val;
			cur = cur.next;
		}
		return res;
	}
	 
}
