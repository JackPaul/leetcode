package medium;

import java.util.ArrayList;
import java.util.List;

public class P179 {

    public static String largestNumber(int[] nums) {
        List<Integer>[] num = new ArrayList[10];
        for(int n :nums) {
        	if(num[(n+"").charAt(0) - '0'] == null)
        		num[(n+"").charAt(0) - '0'] = new ArrayList<Integer>();
        	num[(n+"").charAt(0) - '0'].add(n);
        }
        
        for(List<Integer> li : num) {
        	if(li != null) {
        		sort(li);
        	}
        }
        
        String res = "";
        for(int i = 9; i >= 0; i--) {
        	if(num[i] != null) {
        		for(int j = num[i].size()-1; j >= 0; j--) {
        			res += num[i].get(j);
        		}
        	}
        	
        	if(i == 0 && res.equals(""))
        		return "0";
        }
        
        return res;
    }

	private static void sort(List<Integer> li) {
		for(int i = 0; i < li.size() - 1; i++) {
			for(int j = 0; j < li.size() - 1 - i; j++) {
				if(lg(li.get(j), li.get(j+1))) {
					int c = li.get(j);
					li.set(j, li.get(j+1));
					li.set(j+1, c);
				}
			}
		}
		
	}

	private static boolean lg(Integer i, Integer j) {
		String n1 = i+""+j;
		String n2 = j+""+i;
		for(int k = 0; i < n1.length(); k++) {
			if(n1.charAt(k) > n2.charAt(k))
			return true;
		if(n1.charAt(k) < n2.charAt(k))
			return false;
		}
		return false;
//		String n1 = i+"";
//		String n2 = j+"";
//		String c = null;
//		if(n1.length() == n2.length()) {
//			return i > j;
//		} else if(n1.length() > n2.length()) {
//			for(int k = 0; k < n2.length(); k++) {
//				if(n1.charAt(k) > n2.charAt(k))
//					return true;
//				if(n1.charAt(k) < n2.charAt(k))
//					return false;
//			}
//			return n1.charAt(n2.length()) > n1.charAt(0);
//		} else {
//			for(int k = 0; k < n1.length(); k++) {
//				if(n1.charAt(k) > n2.charAt(k))
//					return true;
//				if(n1.charAt(k) < n2.charAt(k))
//					return false;
//			}
//			return !(n2.charAt(n1.length()) > n1.charAt(0));
//		}

	}
	
	public static void main(String[] args) {
		int[] nums = {10,2};
		System.out.println(largestNumber(nums));
	}
	
}
