package easy;

public class P443 {
    public static int compress(char[] chars) {
    	if(chars.length < 2)
    		return chars.length;
        int count = 1;
        char c = chars[0];
        
        int i;
        int pos = 0;
        int res = 0;
        for(i = 1; i < chars.length; i++) {
        	if(chars[i] != chars[i-1]) {
        		
        		
        		if(count > 1) {
        			res += (count+"").length()+1;
        			chars[pos++] = c;
        			for(char ch : (count+"").toCharArray())
        				chars[pos++] = ch;
        		} else {
        			res ++;
        			chars[pos++] = c;
        		}
        		count = 1;
        		c = chars[i];
        	} else {
        		count ++;
        	}
        }
        
        
		if(count > 1) {
			res += 1 + (count+"").length();
			chars[pos++] = c;
			for(char ch : (count+"").toCharArray())
				chars[pos++] = ch;
		} else {
			chars[pos++] = c;
			res++;
		}     
        
        return res;
    }
    
    


    public static void main(String[] args) {
    	char[] chars = {'a','a','b','b','c','c','c'};
		System.out.println(compress(chars));
	}
}
