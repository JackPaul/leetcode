package hard;

public class P23 {

    public ListNode mergeKLists(ListNode[] lists) {
        /*
    	LinkedList<ListNode> list = new LinkedList<>();
        for(int i = 0; i < lists.length; i++)
            list.offer(lists[i]);
        if(list.size() == 0)
            return null;
        if(list.size() == 1)
            return list.get(0);
        while(list.size() > 1){
            ListNode list1 = (ListNode)list.get(0);
            ListNode list2 = (ListNode)list.get(1);
            list.remove(0);
            list.remove(0);
            list.add(merge(list1, list2)) ;
        }
        return list.get(0);
        */
        /*
        if(lists.length == 0)
            return null;
        if(lists.length == 1)
            return lists[0];
        int i = lists.length - 1;
        while(i > 0){
            ListNode list1 = lists[i];
            ListNode list2 = lists[i-1];
            lists[i-1] = merge(list1, list2);
            i--;
        }
        return lists[0];
        */
        if(lists.length == 0)
            return null;
        if(lists.length == 1)
            return lists[0];
        
        return divideAndConqure(lists, 0, lists.length-1);
    }
    
    public ListNode divideAndConqure(ListNode[] lists, int i, int j) {
		if(i == j)
			return lists[i];
		if(i > j)
			return null;
		int center = (i + j) / 2;
		ListNode left = divideAndConqure(lists, i, center);
		ListNode right = divideAndConqure(lists, center+1, j);
		return merge(left, right);
	}

	public ListNode merge(ListNode list1, ListNode list2){
        if(list1 == null && list2 == null)
            return null;
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;
        if(list1.val > list2.val){
            list2.next = merge(list1, list2.next);
            return list2;
        } else {
            list1.next = merge(list1.next, list2);
            return list1;
        }
    }

}
