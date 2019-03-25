package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;



public class P475 {

/*
    public static int findRadius(int[] houses, int[] heaters) {

        int res = heaters[0] - houses[0];
        while(res < houses[houses.length-1]) {
        	for(int j = 0; j < heaters.length - 1 && heaters[j] < houses[houses.length-1]; j++) {
        		if(heaters[j+1] - heaters[j] > 2 * res) {
        			res++;
        			break;
        		}
        	}
        	if(houses[houses.length-1] - heaters[heaters.length - 1] > res) {
        		res++;
        	} else {
        		break;
        	}
        }
        
        return res;
    }
*/

    public static int findRadius(int[] houses, int[] heaters) {
        int res = 0;
        List<List<Integer>> list = new ArrayList<>();
        int max = 0, min = 1000000001;
        for(int i = 0; i < houses.length; i++) {
        	List<Integer> l = new ArrayList<>();
        	for(int j = 0; j < heaters.length; j++) {
        		int d = Math.abs(houses[i] - heaters[j]);
        		l.add(d);
        		min = min > d?d:min;
        		max = max < d?d:max;
        	}
        	list.add(l);
        }

        boolean flag = true;
        for(int i = min; i <= max; i++) {
        	for(int j = 0; j < list.size(); j++) {
        		Collections.sort(list.get(j));
        		if(i < list.get(j).get(0)) {
        			flag = false;
        			break;
        		}
        			
        	}
        	if(flag)
        		return i;
        	else
        		flag = true;
        }
        return res;
    }
    
    public static void main(String[] args) {
    	int[] a = {282475249,622650073,984943658,144108930,470211272,101027544,457850878,458777923};
    	int[] b = {823564440,115438165,784484492,74243042,114807987,137522503,441282327,16531729,823378840,143542612};

    	
    	System.out.println(findRadius(a, b));
	}

}
