package easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class P155 {
	class MinStack {

		LinkedList<Integer> list = new LinkedList<>();
		int min = 0;
		Integer[] array = null;
	    /** initialize your data structure here. */
	    public MinStack() {
	        
	    }
	    
	    public void push(int x) {
	       list.addFirst(x);
	       if(list.size() == 1)
	    	   min = x;
	       else {
	    	   if(min  > x)
	    		   min = x;
	       }

	    }
	    
	    public void pop() {
	        list.removeFirst();
	        if(list.size() > 0) {
	 	       array = list.toArray(new Integer[0]);
		       Arrays.sort(array);
		       min = array[0];
	        }
	    }
	    
	    public int top() {
	        return list.getFirst();
	    }
	    
	    public int getMin() {
	        return min;
	    }
	}

	/**
	 * Your MinStack object will be instantiated and called as such:
	 * MinStack obj = new MinStack();
	 * obj.push(x);
	 * obj.pop();
	 * int param_3 = obj.top();
	 * int param_4 = obj.getMin();
	 */
	
	public P155() {
		// TODO Auto-generated constructor stub
	}

}
