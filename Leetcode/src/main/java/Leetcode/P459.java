package easy;

public class P459 {
    public boolean repeatedSubstringPattern(String s) {
    	if(s.length() <= 1)
    		return false;
        for(int i = 1; i <= s.length() / 2; i++) {
        	if(s.length() % i == 0) {
        		if(isSubs(s, s.substring(0, i)))
        			return true;
        	}
        	
        }
        
        return false;
    }
    
    private boolean isSubs(String s, String str) {
    	if(s.length() == str.length())
    		return s.equals(str);
		return str.equals(s.substring(0, str.length())) && isSubs(s.substring(str.length(),s.length()), str);
	}
    
    public static boolean repeatedSubstringPattern2(String s) {
        if(s.length()==0 || s.length()==1){
            return false;
        }
        int len = s.length();
        int mid = len/2;
        if(s.substring(0,mid).equals(s.substring(mid))){
            return true;
        }
        int one3 = len/3;
        String one_third = s.substring(0,one3); 
        if(one_third.equals(s.substring(one3,one3*2)) && one_third.equals(s.substring(one3*2))){
            return true;
        }
        
        if(len%2==1){
            for(int i=1;i<len;i++){
                if(s.charAt(0)!=s.charAt(i)){
                    return false;
                }
            }
            return true;
        }
        return false;
    }


}
