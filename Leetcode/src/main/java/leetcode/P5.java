package leetcode;

public class P5 {
    public static String longestPalindrome(String s) {
        if(s.length() < 2)
        	return s;
        String res = "";
        int i = 0;
        int j = 0;
        int max=1;
        int tail = 0;
        res = s.charAt(0) + "";
        for(i = 0; i < s.length(); i++) {
        	j = i + 1;
        	while(j < s.length()) {
        		if(j - i + 1 <= max) {
        			j++;
        			continue;
        		}
        			
        		String s1 = s.substring(i, j+1);
        		if(palindrome(s1)) {
        			if(j - i + 1 > max) {
        				res = s1;
        				max = j - i + 1;
        				tail = i ;
        			}
        		}
        		j += 1;
        	}
        }
        i = tail;
        j = s.length();
        if(palindrome(s.substring(i, j)) && j - i + 1 > max)
        	return s.substring(i, j);
        return res;
    }

	private static boolean palindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while(i < j) {
			if(s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
    
	public static void main(String[] args) {
		System.out.println(longestPalindrome("bananas"));
	}
    
}
