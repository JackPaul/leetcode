package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class P155 {
	class MinStack {
		/*
		LinkedList<Integer> list = new LinkedList<>();
		int min = 0;
		Integer[] array = null;
	    
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
	    */
		private LinkedList<Integer> nums = null;
		private LinkedList<Integer> mins = null;
		/** initialize your data structure here. */
	    public MinStack() {
			nums = new LinkedList<Integer>();
			mins = new LinkedList<Integer>();
	    }
	    
	    public void push(int x) {
            if(mins.isEmpty()) {
            	nums.push(x);
            	mins.push(x);
            	return;
            }
            nums.push(x);
	        int m = mins.peek();
	        if(x < m) {
	        	mins.push(x);
	        } else {
	        	mins.push(m);
	        }
	    }
	    
	    public void pop() {
	    	if(mins.isEmpty())
	    		return;
	    	mins.pop();
	        nums.pop();
	    }
	    
	    public int top() {
	    	return nums.peek();
	    }
	    
	    public int getMin() {
	        return mins.peek();
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
