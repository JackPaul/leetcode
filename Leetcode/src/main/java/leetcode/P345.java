package leetcode;

public class P345 {

    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while(i < j) {
        	if(isVowel(chars[i]) && isVowel(chars[j])) {
                if(chars[i] != chars[j]){
                    char c = chars[i];
        		    chars[i] = chars[j];
        		    chars[j] = c;
                }
                i++;j--;

        	} else if(isVowel(chars[i])) {
        		j--;
        	} else if(isVowel(chars[j])) {
        		i++;
        	} else {
        		i++;j--;
        	}
        }
        
        return new String(chars);
    }
    
    public boolean isVowel(char c) {
    	return c == 'a' || c == 'A' || c == 'e' || c == 'E' 
    			|| c == 'i' || c == 'I' || c == 'o' || c == 'O' ||
    			c == 'u' || c == 'U';
    }
}
