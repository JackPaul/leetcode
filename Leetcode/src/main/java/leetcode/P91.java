package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P91 {
	/*
	int res = 0;
    public int numDecodings(String s) {
    	numDecodingsHelper(s);
        return res;
    }
	private void numDecodingsHelper(String s) {
		if(s.length() < 2) {
			res++;
			return;
		}		
        if(s.charAt(0) > '2' || (s.charAt(0) == '0'))
            return;
        numDecodingsHelper(s.substring(1));
        if(Integer.parseInt(s.substring(0, 2)) > 26)
        	return;
        numDecodingsHelper(s.substring(2));		
	}
	*/
	//还可用动态规划
    public static int numDecodings(String s) {
        if(s.length() == 1) {
            
        }
    	int[] dp = new int[s.length() + 1];
        dp[s.length()] = 1;
        for(int i = s.length() - 1; i >= 0; i--) {
            if(i == s.length() - 1) {
                dp[i] = s.charAt(i) == '0'?0:1;
            } else {
                
                if(s.charAt(i) == '0'){
                       dp[i] = 0;
                       continue;
                   }
                dp[i] = dp[i+1];
                if(s.charAt(i) != '0' && Integer.parseInt(s.substring(i, i+2)) <= 26){
                    dp[i] += dp[i+2];
                }
            }
        }
        return dp[0];
    }
	public static void main(String[] args) {
		System.out.println(numDecodings("226"));
	}
}
