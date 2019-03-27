package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P599 {

    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        int minSumOfIndices = list1.length + list2.length;
        int k = 0;
        for(String s : list1) {
        	map.put(s, k++);
        }       
        int sum = 0;
        List<String> r = new ArrayList<>();
        for(int i = 0; i < list2.length && i <= minSumOfIndices; i++) {
        	if(map.containsKey(list2[i])) {
        		sum = i + map.get(list2[i]);
        		if(minSumOfIndices > sum) {
        			minSumOfIndices = sum;
        			r.clear();
        			r.add(list2[i]);
        		} else if(minSumOfIndices == sum) {
        			r.add(list2[i]);
        		}
        	}
        }    
        return r.toArray(new String[0]);
    }

    public static void main(String[] args) {
		String[] a = {"Shogun","Tapioca Express","Burger King","KFC"};
		String[] b = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
		System.out.println(findRestaurant(a, b)[0]);
    }
}
