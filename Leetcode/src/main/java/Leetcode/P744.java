package easy;

public class P744 {

    public char nextGreatestLetter(char[] letters, char target) {
    	int[] charMap = new int[letters.length];

    	char min = 'z'+1;
    	for(int i = 0; i < letters.length; i++) {
    		if(letters[i]  > target) {
    			if(letters[i] < min) {
    				min = letters[i];
    			}
    		}
    	}
    	
    	if(min == 'z'+1) {
        	for(int i = 0; i < letters.length; i++) {
        		if(letters[i]  < target) {
        			if(letters[i] < min) {
        				min = letters[i];
        			}
        		}
        	}
    	} 
    	return min;
    }

}
