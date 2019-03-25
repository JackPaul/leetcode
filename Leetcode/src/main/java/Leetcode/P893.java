package easy;

import java.util.HashMap;
import java.util.Map;

public class P893 {
    public int numSpecialEquivGroups(String[] A) {
        int res = 0;
        for(int i = 0; i < A.length; i++) {
        	if(!A[i].equals("0")) {
        		for(int j = i + 1; j < A.length; j++) {
        			if(A[i].length() == A[j].length() && group(A[i], A[j])) {
        				A[j] = "0";
        			}
        		}
        		A[i] = "0";
        		res++;
        	}
        }
        return res;
    }

	private boolean group(String A, String B) {
		Map<Character, Integer> mapAeven = new HashMap<>();
		Map<Character, Integer> mapAodd = new HashMap<>();
		Map<Character, Integer> mapBeven = new HashMap<>();
		Map<Character, Integer> mapBodd = new HashMap<>();
		for(int i = 0; i < A.length(); i += 2) {
			if(mapAeven.containsKey(A.charAt(i))) {
				mapAeven.put(A.charAt(i), mapAeven.get(A.charAt(i)) + 1);
			} else {
				mapAeven.put(A.charAt(i), 1);
			}
			
			if(mapBeven.containsKey(B.charAt(i))) {
				mapBeven.put(B.charAt(i), mapBeven.get(B.charAt(i)) + 1);
			} else {
				mapBeven.put(B.charAt(i), 1);
			}
		}
		
	    for(int i = 1; i < A.length(); i += 2) {
	        if(mapAodd.containsKey(A.charAt(i))) {
	          mapAodd.put(A.charAt(i), mapAodd.get(A.charAt(i)) + 1);
	        } else {
	          mapAodd.put(A.charAt(i), 1);
	        }
	        
	        if(mapBodd.containsKey(B.charAt(i))) {
	          mapBodd.put(B.charAt(i), mapBodd.get(B.charAt(i)) + 1);
	        } else {
	          mapBodd.put(B.charAt(i), 1);
	        }
	     }
		return mapAeven.equals(mapBeven) && mapAodd.equals(mapBodd);
	}
}
