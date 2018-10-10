package medium;

public class P748 {

    public static String shortestCompletingWord(String licensePlate, String[] words) {
    	licensePlate = licensePlate.toLowerCase();
    	int[] chars = new int[26];
    	
    	for(int i = 0; i < licensePlate.length(); i++) {
    		if(licensePlate.charAt(i) >= 'a' && licensePlate.charAt(i) <= 'z') {
    			chars[licensePlate.charAt(i) - 'a']++;
    		}
    	}
    	
    	
    	int minLen = 0;
    	String res = "";
    	
    	int[] charMap = new int[26];
    	for(String s : words) {
    		charMap = new int[26];
    		for(int i = 0; i < s.length(); i++) {
        		if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
        			charMap[s.charAt(i) - 'a']++;
        		}
        	}		
    		boolean flag = true;
    		for(int i = 0; i < 26; i++) {
    			if(chars[i] > 0 && charMap[i] < chars[i]) {
    				flag = false;
    				break;
    			}
    				
    		}
    		
    		if(flag) {
    			if(minLen == 0) {
    				res = s;
    				minLen = s.length();
    			} else if(minLen > s.length()) {
    				res = s;
    				minLen = s.length();
    			}
    		}
    	}
    	
    	return res;
    }
    
    public static void main(String[] args) {
		String licensePlate = "1s3 PSt";
		String[] words = {"step", "steps", "stripe", "stepple"};
		System.out.println(shortestCompletingWord(licensePlate, words));
	}
}
