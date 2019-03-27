package leetcode;

public class P434 {

    public static int countSegments(String s) {
    	if(s == null || "".equals(s))
    		return 0;
    	int count = 0;
    	boolean flag = false;
    	for(int i = 0; i < s.length(); i++) {
    		if(s.charAt(i) != ' ') {
    			if(!flag) {
    				count++;
    				flag = true;
    			}
    		} else {
    			flag = false;
    		}
    	}
    	
    	return count;
    }

    public static void main(String[] args) {
    	String s = ", , , ,        a, eaefa";
    	System.out.println(countSegments(s));
	}
}
