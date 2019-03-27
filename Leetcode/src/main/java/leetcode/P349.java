package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P349 {

	public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int i = 0; i < nums1.length; i++) {
        	set1.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++) {
        	set2.add(nums2[i]);
        }
        
        set1.retainAll(set2);
        Integer[] res1 = set1.toArray(new Integer[0]);
        int[] r = new int[res1.length];
        for(int i = 0; i < res1.length; i++) {
        	r[i] = res1[i];
        }
        return r;
    }
}
