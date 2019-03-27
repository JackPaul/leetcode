package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P56 {
	private class Interval {
		      int start;
		      int end;
		      Interval() { start = 0; end = 0; }
		      Interval(int s, int e) { start = s; end = e; }
	}
	
    public static List<Interval> merge(List<Interval> intervals) {
        List<Interval> res = new ArrayList<>();
    	boolean[] flag = new boolean[intervals.size()];
    	
    	
    	for(int i = 0; i < intervals.size(); i++) {
    		if(!flag[i]) {
    			boolean found = false;
    			for(int j = i + 1; j < intervals.size(); j++) {
    				if(!flag[j]) {
    					if(!(intervals.get(i).end < intervals.get(j).start || intervals.get(i).start > intervals.get(j).end)) {
    						intervals.get(i).start = Math.min(intervals.get(i).start, intervals.get(j).start);
    						intervals.get(i).end = Math.max(intervals.get(i).end, intervals.get(j).end);
    						flag[j] = true;
    						found = true;
    					}
    				}
    			}
    			if(!found) {
    				res.add(intervals.get(i));
    				flag[i] = true;
    			} else {
    				i--;
    			}	
    		}
    	}		
    	return res;
    }
    
    
    
    public static void main(String[] args) {
		
	}
}
