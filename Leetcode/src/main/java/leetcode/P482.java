package leetcode;

public class P482 {
    public static String licenseKeyFormatting(String S, int K) {
        StringBuilder sb = new StringBuilder();
        
        int i = S.length() - 1;
        
        int count = 0;
        char c;
        while(i >= 0) {
        	
        	c = S.charAt(i);
        	if(c != '-') {
            	if(c >= 'a' && c <= 'z')
            		c = (char) (c - 32);
            	sb.append(c);
            	count ++;
            	if(count == K) {
            		sb.append('-');
            		count = 0;
            	}
        	}
        	i--;	
        }

        String res = sb.reverse().toString();
        if(res.length() == 0)
        	return res;
        if(res.charAt(0) == '-')
        	return res.substring(1);
        return res;
    }
    
    public static void main(String[] args) {
		System.out.println(licenseKeyFormatting("---", 3));
	}
}
