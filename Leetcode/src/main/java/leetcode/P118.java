package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P118 {

    public List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	List<Integer> list1 = new ArrayList<>();
    	list1.add(1);
    	List<Integer> list2 = new ArrayList<>();
    	list2.add(1);list2.add(1);
    	if(numRows == 0)
    		return res;
    	
    	if(numRows == 1) {
    		res.add(list1);
    		return res;
    	}
    	
    	if(numRows == 2) {
    		res.add(list1);
    		res.add(list2);
    		return res;
    	}
    	
        res.add(list1);
    	res.add(list2);
    	for(int i = 2; i < numRows; i++) {
    		List<Integer> currentList = new ArrayList<>();
    		List<Integer> list = res.get(res.size()-1);
    		for(int j = 0; j < list.size() - 1; j++) {
    			currentList.add(list.get(j) + list.get(j+1));
    		}
    		currentList.add(0, 1);
    		currentList.add(1);
    		res.add(currentList);
    	}	
    	return res;
    }

}
