package hard;

public class P72 {

    public int minDistance(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int[][] dp = new int[len1][len2];
        for(int i = 0; i < len1; i++) {
        	dp[i][0] = i;
        }
        for(int i = 0; i < len2; i++) {
        	dp[0][i] = i;
        }
        for(int i = 1; i < len1; i++) {
        	for(int j = 1; j < len2; j++) {
        		int k = 1;
        		if(word1.charAt(i) == word2.charAt(j)) {
        			k = 0;
        		}
        		int min = Math.min(dp[i-1][j-1]+k, dp[i-1][j]+1);
        		min = Math.min(min, dp[i][j-1]+1);
        		dp[i][j] = min;
        	}
        }
        return dp[len1][len2];
    }

}
