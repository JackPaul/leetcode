package hard;

public class P10 {
    public boolean isMatch(String s, String p) {
        if(s.length() == 0 && p.length() == 0)
            return true;
        if(s.length() > 0 && p.length() == 0)
            return false;
        if(s.length() == 0 && p.length() > 0){
            if(p.length() == 1)
                return false;
            if(p.charAt(1) == '*')
                return isMatch(s, p.substring(2));
            return false;
        }
            
        //若首字母匹配
        if(s.charAt(0) == p.charAt(0) || p.charAt(0) == '.') {
            if(p.length() == 1)
                return isMatch(s.substring(1), p.substring(1));
            if(p.charAt(1) == '*')
                return isMatch(s.substring(1), p) || isMatch(s, p.substring(2));
            return isMatch(s.substring(1), p.substring(1));
        } else {//若首字母不匹配
            if(p.length() == 1)
                return false;
            if(p.charAt(1) == '*')
                return isMatch(s, p.substring(2));
            return false;
        }
    }
}
