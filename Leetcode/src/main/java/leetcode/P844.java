package leetcode;

public class P844 {

    public boolean backspaceCompare(String S, String T) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        char c;
        for(int  i = 0; i < S.length(); i++) {
        	c = S.charAt(i);
        	if(c != '#')
        		sb1.append(c);
        	else {
        		if(sb1.length() > 0)
        			sb1.deleteCharAt(sb1.length()-1);
        	}
        }
        
        for(int  i = 0; i < T.length(); i++) {
        	c = T.charAt(i);
        	if(c != '#')
        		sb2.append(c);
        	else {
        		if(sb2.length() > 0)
        			sb2.deleteCharAt(sb2.length()-1);
        	}
        }   
        return sb1.toString().equals(sb2.toString());
    }


}
