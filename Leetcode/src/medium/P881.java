package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class P881 {
	
	/*
    public static int numRescueBoats(int[] people, int limit) {
        int res = 0;
        
        Arrays.sort(people);
        int[] position = new int[limit+1];
       
        for(int i = 0; i < people.length; i++) {
        	position[people[i]] = i;
        }
        
        boolean[] flag = new boolean[people.length];
        int i = people.length - 1;
        int j = 0;
        int count = 0;
        int f = 0;
        while(count < people.length) {
        	
        	if(flag[i]) {
        		i--;
        		continue;
        	}
        	if(limit - people[i] == 0) {
        		count++;
        		res++;
        		flag[i] = true;
        		i--;
        	} else {
        		flag[i] = true;
        		for(j = position[people[i]]==0?i-1:position[people[i]]; j >= 0; j--) {
        			if(!flag[j] && people[j] <= limit - people[i]) {
        				flag[j] = true;
        				count++;
        				f = j + 1;
        				break;
        			}
        		}
                count++;
    			res++;
    			i--;
        	}
        }
        return res;
    }
    
    */
	
	public static int numRescueBoats(int[] people, int limit) {
		if(people.length <= 1)
			return people.length;
		int res = 0;
		Arrays.sort(people);
		
		int i = 0, j = people.length - 1;
		while(i <= j) {
			if(people[i] + people[j] > limit) {
				j--;
			} else {
				i++;
				j--;
			}
			res++;
		}
		
		return res;
	}
    public static void main(String[] args) {
		int[] people = {5,1,7,4,2,4};
		System.out.println(numRescueBoats(people, 7));
	}
}
