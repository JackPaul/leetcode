package hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

 class Interval {
     int start;
     int end;
     Interval() { start = 0; end = 0; }
     Interval(int s, int e) { start = s; end = e; }
	@Override
	public String toString() {
		return "Interval [start=" + start + ", end=" + end + "]";
	}
     
 }

public class P57 {

//    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
//    	//新区间在左边
//    	if(intervals.get(0).start > newInterval.end) {
//			intervals.add(0, newInterval);
//			return intervals;
//		}
//    	//新区间在右边
//    	if(intervals.get(intervals.size()-1).end < newInterval.start) {
//			intervals.add(newInterval);
//			return intervals;
//		}
//    	//新区间包含
//    	if(intervals.get(0).start > newInterval.start && intervals.get(intervals.size()-1).end > newInterval.end) {
//			List<Interval> list = new ArrayList<>();
//			list.add(newInterval);
//			return list;
//		}
//    	
//        
//        return intervals;
//    }
    
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {

    	List<Interval> list =  new ArrayList<>();
    	if(intervals.size() == 0) {
    		list.add(newInterval);
    		return list;
    	}
    	int i = 0;
    	for(i = 0; i < intervals.size(); i++) {
    		Interval itv = intervals.get(i);
    		if(itv.end < newInterval.start) {
    			list.add(itv);
    		} else if(itv.start > newInterval.end) {
    			list.add(newInterval);
    			break;
    		} else {
    			newInterval.start = Math.min(itv.start, newInterval.start);
    			newInterval.end = Math.max(itv.end, newInterval.end);
    		}
    	}
        if(i == intervals.size())
            list.add(newInterval);
        else
            for(int j = i; j < intervals.size(); j++) {
                list.add(intervals.get(j));
            }
        
        return list;
    }

}
