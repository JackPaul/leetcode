package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P93 {

    public static List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        restoreIpAddress(s, 4, res, "");
        return res;
    }
    
    public static void restoreIpAddress(String s, int n, List<String> res, String cur) {
        if(s.equals("") && n == 0) {
            res.add(new String(cur.substring(0, cur.length()-1)));
            return;
        }
        
        if(s.equals("") || n == 0)
            return;
        
        if(s.length() > n * 3 || s.length() < n)
            return;
        cur += s.substring(0,1)+".";
        restoreIpAddress(s.substring(1,s.length()), n-1, res, cur);
        cur = cur.substring(0, cur.length()-2);
        if(s.length() < 2)
            return;
        cur += s.substring(0,2)+".";
        restoreIpAddress(s.substring(2,s.length()), n-1, res, cur);
        cur = cur.substring(0, cur.length()-3);
        if(s.length() < 3)
            return;
        if(Integer.parseInt(s.substring(0,3)) > 255)
            return;
        cur += s.substring(0,3)+".";
        restoreIpAddress(s.substring(3,s.length()), n-1, res, cur);
        cur = cur.substring(0, cur.length()-4);
    }
    
    public static void main(String[] args) {
		System.out.println(restoreIpAddresses("2551440970"));
	}
}
