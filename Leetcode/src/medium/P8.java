package medium;

public class P8 {
    public static int myAtoi(String str) {
        if(str.isEmpty())
        	return 0;
        char c = ' ';
        int flag = 1;
        int i = 0;
        //¿¼ÂÇÒç³ö

        for(i = 0; i < str.length(); i++) {
        	c = str.charAt(i);
        	if(c != ' ') {
        		break;
        	}
        }
        
        if(c != '+' && c != '-' && !(c >= '0' && c <= '9')) {
        	return 0;
        }
        
        long res = 0;
        if(c >= '0' && c <= '9') {
			res = c - '0';
		} else if(c == '+') {
			flag = 1;
		} else if(c == '-') {
			flag = -1;
		}
        
        for(int j = i + 1; j < str.length(); j++) {
        	if(str.charAt(j) < '0' || str.charAt(j) > '9')
        		break;
        	res = res * 10 + str.charAt(j) - '0';
            if(flag == 1 && res >= Integer.MAX_VALUE) {
            	return Integer.MAX_VALUE;
            }
            
            if(flag == -1 && res * -1 <= Integer.MIN_VALUE) {
            	return Integer.MIN_VALUE;
            }
        }
        
        if(flag == 1 && res >= Integer.MAX_VALUE) {
        	return Integer.MAX_VALUE;
        }
        
        if(flag == -1 && res * -1 <= Integer.MIN_VALUE) {
        	return Integer.MIN_VALUE;
        }
        
        return (int) (flag * res);
    }
    
    public static void main(String[] args) {
		System.out.println(myAtoi("9223372036854775808"));
	}
}
