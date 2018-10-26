package medium;

import java.util.List;

public class P120 {
    public int minimumTotal(List<List<Integer>> triangle) {
    	if(triangle.size() == 1) {
    		return triangle.get(0).get(0);
    	}
        
    	int d = 0, d1 = 0;
    	for(int i = triangle.size() - 2; i >= 0; i--) {
    		List<Integer> list1 = triangle.get(i);
    		List<Integer> list2 = triangle.get(i+1);
    		for(int j = 0; j < i + 1; j++) {
    			d1 = list1.get(j);
    			d = Math.min(list2.get(i), list2.get(i+1));
    			list1.set(j, d+d1);
    		}
    	}
        return triangle.get(0).get(0);
    }
}
