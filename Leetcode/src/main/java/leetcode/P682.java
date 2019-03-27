package leetcode;

import java.util.ArrayList;

public class P682 {

	 public int calPoints(String[] ops) {
	      int total=0;
	      
	      ArrayList<Integer> marks = new ArrayList<>();
	      int i=0;
	      for(String s : ops) {
	    	  if("+".equals(s)) {
	    		  i = marks.get(marks.size()-1)+marks.get(marks.size()-2);
	    		  total += i;
	    		  marks.add(i);
	    	  } else if("C".equals(s)) {
	    		  i = marks.get(marks.size()-1);
	    		  marks.remove(marks.size()-1);
	    		  total -= i;
	    		  
	    	  } else if("D".equals(s)) {
	    		  i = marks.get(marks.size()-1)*2;
	    		  marks.add(i);
	    		  total += i;
	    	  } else {
	    		  i = Integer.parseInt(s);
	    		  marks.add(i);
	    		  total += i;
	    	  }
	      }
	      
	      return total;
	 }

}
