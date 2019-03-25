package hard;

public class P44 {

    public static boolean isMatch(String s, String p) {
        if(s.equals("") && p.equals(""))
            return true;
        if(p.length() == 0 && s.length() > 0)
            return false;
        if(p.length() >= 0 && s.length() == 0){
            if(p.charAt(0) == '*') {
            	while(p.length() > 1 && p.charAt(1) == '*')
            		p = p.substring(1);
                return isMatch(s, p.substring(1));
            } else
                return false;
        }
        
        if(s.charAt(0) == p.charAt(0) || p.charAt(0) == '?' || p.charAt(0) == '*') {
            if(p.charAt(0) == '?')
                return isMatch(s.substring(1), p.substring(1));
            if(p.charAt(0) == '*') {
            	while(p.length() > 1 && p.charAt(1) == '*')
            		p = p.substring(1);
            	return isMatch(s, p.substring(1)) || isMatch(s.substring(1), p);

            }
            return isMatch(s.substring(1), p.substring(1));
        }
        
        return false;
    }
    
    public static void main(String[] args) {
    	String s = "babaaababaabababbbbbbaabaabbabababbaababbaaabbbaaab";
    	String p = "***bba**a*bbba**aab**b";
		System.out.println(isMatch(s, p));
	}

}
