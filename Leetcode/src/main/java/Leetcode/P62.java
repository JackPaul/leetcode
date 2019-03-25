package medium;

public class P62 {
	/*
	运行时间太长
    public static int uniquePaths(int m, int n) {
        if(m == 1 || n == 1)
            return 1;
        if(m == 2)
            return n;
        if(n == 2)
            return m;
        if(m == n) {
        	int a = uniquePaths(m, n - 1);
        	return 2 * a;
        } else {
        	return uniquePaths(m, n - 1) + uniquePaths(m - 1,  n);
        }
    }
    */
	
	public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        dp[m-1][n-1] = 0;
        for(int i = 0; i < m; i++){
            dp[i][n-1] = 1;
        }
        for(int i = 0; i < n; i++){
            dp[m-1][i] = 1;
        }
        for(int i = m-2 ; i >= 0; i--){
            for(int j = n-2; j >= 0; j--){
                dp[i][j] = dp[i+1][j] + dp[i][j+1];
            }
        }
        return dp[0][0];
    }
    public static void main(String[] args) {
		System.out.println(uniquePaths(51, 9));
	}
}
