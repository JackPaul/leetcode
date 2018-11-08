package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class P851 {
	
	public int[] loudAndRich(int[][] richer, int[] quiet) {
        int[] res = new int[quiet.length];
        for(int i = 0; i < quiet.length; i++) {
        		res[i] = i;
        }
        
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i = 0; i < richer.length; i++) {
        	int x = richer[i][0];
        	int y = richer[i][1];
        	if(!map.containsKey(y))
        		map.put(y, new ArrayList<>());
        	map.get(y).add(x);
        }
        
        
        return res;
    }
}
