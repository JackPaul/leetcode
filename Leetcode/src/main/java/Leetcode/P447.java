package easy;

import java.util.HashMap;
import java.util.Map;

public class P447 {

    public static int numberOfBoomerangs(int[][] points) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        Integer d = 0;
        for(int i = 0; i < points.length; i++) {
        	for(int j = 0; j < points.length; j++) {
        		if(i == j) {
        			continue;
        		}
        		d = (points[i][0] - points[j][0]) * (points[i][0] - points[j][0]) + (points[i][1] - points[j][1]) * (points[i][1] - points[j][1]);
        		if(map.containsKey(d)) {
        			map.put(d, map.get(d) +1);
        		} else {
        			map.put(d, 1);
        		}
        	}

            for(Integer n : map.values()) {
            	res += n * (n-1);
            }
            
            map.clear();
        }
        return res;
    }
    
    public static void main(String[] args) {
		int[][] a = {{0,0},{1,0},{-1,0},{0,1},{0,-1}};
		System.out.println(numberOfBoomerangs(a));
	}
}
