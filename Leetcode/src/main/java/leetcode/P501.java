package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class P501 {
    public static int[] findMode(TreeNode root) {
    	if(root == null)
    		return  new int[0];
        Map<Integer, Integer> map = new HashMap<>();
        findModeHelper(root, map, root.val);
        
        
        int max = Collections.max(map.values());
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> e : map.entrySet()) {
        	if(e.getValue() == max) {
        		list.add(e.getKey());
        	}
        }
        int[] res = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
        	res[i] = list.get(i);
        return res;
    }

	public static void findModeHelper(TreeNode root, Map<Integer, Integer> map, int val) {
		if(root == null) {
			return;
		}
		
		if(root.val == val) {
			if(map.containsKey(val)) {
				map.put(val,  map.get(val) + 1);
			} else {
				map.put(val, 1);
			}
			
			findModeHelper(root.left, map, val);
			findModeHelper(root.right, map, val);
		} else {

			findModeHelper(root, map, root.val);

		}
		
	}
	
	public static void main(String[] args) {
		TreeNode node = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(2);
		node2.left = node3;
		node.right = node2;
		
		System.out.println(findMode(node));
		
	}
}
