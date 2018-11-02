package medium;

public class P647 {
    public static int countSubstrings(String s) {
    	if(s.isEmpty())
    		return 0;
        int res = 0;
        for(int i = 0; i < s.length(); i++) {
        	int j = i+1;
            while(j <= s.length()) {
            	if(palindromic(s.substring(i, j))) {
            		res++;
            	}
            	j++;
            }
        }
        return res;
    }

	private static boolean palindromic(String s) {
		int i = 0;
		int j = s.length() - 1;
		while(i < j) {
			if(s.charAt(i) != s.charAt(j))
				return false;
			i++;j--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(countSubstrings("abc"));
	}
}
