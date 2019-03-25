package easy;

public class P125 {

    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        
        while(i < j) {
        	if(!alphanumeric(s.charAt(i)) && !alphanumeric(s.charAt(j))) {
        		i++;j--;
        	} else if(!alphanumeric(s.charAt(i))) {
        		i++;
        	} else if(!alphanumeric(s.charAt(j))) {
        		j--;
        	} else {
        		if((digit(s.charAt(i)) && digit(s.charAt(j))) || (alpha(s.charAt(i)) && alpha(s.charAt(j)))) {
        			if(digit(s.charAt(i)) && s.charAt(i) != s.charAt(j))
        				return false;
        			if(alpha(s.charAt(i)) && (s.charAt(i) != s.charAt(j) && (int)Math.abs(s.charAt(i) - s.charAt(j)) != 32))
        				return false;
        			i++;j--;
        		} else {
        			return false;
        		}
        	}
        }
        
        return true;
    }
    
    public static boolean alphanumeric(char c) {
    	return alpha(c) || digit(c);
    }

    public static boolean alpha(char c) {
    	return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
    
    public static boolean digit(char c) {
    	return (c >= '0' && c <= '9');
    }
    
    public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"
));
	}
}
