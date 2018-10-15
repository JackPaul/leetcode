package medium;

public class P6 {
    public  static String convert(String s, int numRows) {
    	if(numRows == 1)
    		return s;
        String res = "";
        int i = 0;
        int n = numRows;
        
        int g = s.length() / (2 * n - 2);
        int l = s.length() % (2 * n - 2);
        if(l == 0) {
        	g *= 2;
        } else {
        	g = (g + 1) * 2;
        	if(l <= n)
        		g--;
        }
        
        int len = s.length();
        char[][] chars = new char[g][n];
        int index = 0;
        int count=0;
        while(len >= (2 * n -2)) {
        	for(int j = 0; j < n; j++) {
        		chars[index][j] = s.charAt(count++);
        	}
        	index++;
        	for(int j = n - 2; j >= 1; j--) {
        		chars[index][j] = s.charAt(count++);
        	}
        	index++;
        	len = len - 2 * n + 2;
        }
        
    	for(int j = 0; j < n && len > 0; j++) {
    		chars[index][j] = s.charAt(count++);
    		len--;
    	}
    	index++;


    	for(int j = n - 2; j >= 1 && len > 0; j--) {
    		chars[index][j] = s.charAt(count++);
    		len--;
    	}
    	for(int k = 0; k < n; k++) {
    		for(int j = 0; j < g; j++)
    			if(chars[j][k] != '\0')
    				res += chars[j][k];
    		}
        return res;
    }
    
    public static void main(String[] args) {
		char[] a = new char[5];
		a[0] = 'a';
		a[4] = 'b';
		System.out.println(convert("PAYPALISHIRING", 5));
	}
}
