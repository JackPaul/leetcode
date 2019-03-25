package hard;

public class P32 {

    public static int longestValidParentheses(String s) {
        if(s.length() < 2)
            return 0;
        int left = 0;
        int right = 0;
        int i = 0, j = 0;
        int max = 0;
        
        for(int k = 0; k < s.length() - 1; k++) {
        	i = k;j = k;
        	left = 0;right=0;
        	 while(i < s.length() && s.charAt(i) == ')') {
                 i++;
                 j++;
             }
             
             while(i <= j && i < s.length() && j < s.length()) {
                 if(s.charAt(j) == '(')
                     left++;
                 else
                     right++;
                 if(right == left) {
                     max = max > j - i + 1?max:j - i + 1;
                     j++;
                 } else if(right > left) {
                     j = j + 1;
                     i = j;
                     left = 0;
                     right = 0;
                     
                 } else {
                     j++;
                 }
             }
        }
        
        return max; 
    }
    
    public static void main(String[] args) {
		System.out.println(longestValidParentheses("(()"));
	}
}
