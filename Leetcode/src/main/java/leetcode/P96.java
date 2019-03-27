package leetcode;

public class P96 {
    public static int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0; dp[1] = 1;
        if(n <= 1)
        	return dp[n];

        for(int i = 2; i <= n; i++) {
        	dp[i] = dp[i-1] * 2;
        	for(int j = i-2; j >= 1; j--) {
        		dp[i] += dp[j] * dp[i-1-j];
        	}
        }
        return dp[n];
    }
    
    public static void main(String[] args) {
		System.out.println(numTrees(4));
	}
}
