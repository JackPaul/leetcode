package easy;

public class P680 {
	
    public static boolean validPalindrome(String s) {
    	int count = 0;
        int i = 0, j = s.length() - 1;
        while(i < j) {
        	if(s.charAt(i) != s.charAt(j)) {
        		if(count > 0)
        			return false;
        		else {
        			count++;
        			if(i == j - 1)
        				return true;
        			else {
        				if(s.charAt(i+1) == s.charAt(j) && s.charAt(i+2) == s.charAt(j-1))
        					i++;
        				else if(s.charAt(i) == s.charAt(j-1) && s.charAt(i+1) == s.charAt(j-2))
        					j--;
        			}
        		}
        	}else {
        		i++;
        		j--;
        	}
        }
        return true;
    }
    
    public static void main(String[] args) {
		System.out.println(validPalindrome("lcupuuuupucul"));
		
	}
}
