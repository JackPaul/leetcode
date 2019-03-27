package leetcode;

import java.text.SimpleDateFormat;
import java.util.Date;

public class P135 {

    public static int candy(int[] ratings) {
    	if(ratings.length == 0)
    		return 0;
    	if(ratings.length == 1)
    		return 1;

        int i = 1;
        int[] candys = new int[ratings.length];
        
        candys[0] = 1;
        while(i < candys.length) {
        	if(ratings[i] > ratings[i-1]) {
        		candys[i] = candys[i-1] + 1;
        	} else if(ratings[i] == ratings[i-1]){
        		candys[i] = 1;
        	}       		
        	else {
        		if(candys[i-1] == 1) {
        			candys[i] = 1;
            		for(int j = i-1; j >= 0; j--) {
            			if(ratings[j] > ratings[j+1] && candys[j] <= candys[j+1])
            				candys[j]++;
            		}
        		} else
        			candys[i] = 1;
        	}
        	i++;
        }
        int res = 0;
        for(int n : candys) {
        	res += n;
        }
        return res;
    }
    
    public static void main(String[] args) {
  
        
	}
}
