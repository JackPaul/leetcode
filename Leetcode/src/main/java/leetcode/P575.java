package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P575 {

	 public int distributeCandies(int[] candies) {
		 Arrays.sort(candies);
		 Set<Integer> set = new HashSet<>();
	     Set<Integer> set1 = new HashSet<>();
	     Set<Integer> set2 = new HashSet<>();
	     for(int i = 0; i < candies.length-1; i+=2) {
//	    	  set1.add(candies[i]);
//	    	  set2.add(candies[i+1]);
	    	 set.add(candies[i]);
	     }
	     
	     int n = candies.length / 2;
	     
	     if(set.size() <= n)
	    	 return set.size();
	     else {
	    	 return n;
	     }  
	     //return set2.size()>set1.size()?set2.size():set1.size();
	 }
	 
	 public static void main(String[] args) {
		int[] a = {3,1,2,4};
		Arrays.sort(a);
		//System.out.println(a[1]);
	}

}
