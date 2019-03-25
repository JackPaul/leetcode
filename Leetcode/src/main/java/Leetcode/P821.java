package easy;

import java.util.ArrayList;
import java.util.List;

public class P821 {
	
	public int[] shortestToChar(String S, char C) {
		int[] res = new int[S.length()];	
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < S.length(); i++) {
			if(S.charAt(i) == C) {
				list.add(i);
			}
		}
		
		List<Integer> list2 = new ArrayList<>();
		for(int i = 0; i < S.length(); i++) {
			list2.addAll(list);
			int minDistance=S.length();
			for(int j : list2) {
				int d = j - i;
				j = d>0?d:d*-1;
				if(j < minDistance) {
					minDistance = j;
				}
			}
			res[i] = minDistance;
		}
		
		return res;
	}

}
