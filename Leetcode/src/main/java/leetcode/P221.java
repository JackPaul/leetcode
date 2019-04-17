package leetcode;

/**
 * @author jackpaul <jiekepao@gmail.com>
 * Created on 2019-04-17 20:46
 * @Description:
 */
public class P221 {

    /**
     * 动态规划走起
     * @param matrix
     * @return
     */
    public int maximalSquare(char[][] matrix) {
        if(matrix.length == 0) {
            return 0;
        }
        int maxLen = 0;
        int[][] dp = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++) {
            if(matrix[i][0] == '1') {
                dp[i][0] = 1;
                maxLen = 1;
            }
        }

        for(int i = 0; i < matrix[0].length; i++) {
            if(matrix[0][i] == '1') {
                dp[0][i] = 1;
                maxLen = 1;
            }
        }

        for(int i = 1; i < matrix.length; i++) {
            for(int j = 1; j < matrix[0].length; j++) {
                if(matrix[i][j] == '1') {
                    if(dp[i-1][j-1] == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = 1;
                        int l1 = i - dp[i-1][j-1];
                        int l2 = j - dp[i-1][j-1];
                        boolean flag = true;
                        for(int k = l1; k < i; k++) {
                            if(matrix[k][j] == '0') {
                                flag = false;
                                break;
                            }
                        }

                        for(int k = l2; k < j; k++) {
                            if(matrix[i][k] == '0') {
                                flag = false;
                                break;
                            }
                        }
                        if(flag) {
                            dp[i][j] = dp[i - 1][j - 1] + 1;
                        } else {
                            int m = 0;
                            while (m <= dp[i-1][j-1] && i >= m && j >= m) {
                                if (matrix[i][j - m] == '1' && matrix[i - m][j] == '1') {
                                    m++;
                                } else {
                                    break;
                                }
                            }
                            dp[i][j] = m;
                        }
                        if(dp[i][j] > maxLen)
                            maxLen = dp[i][j];
                    }
                }
            }
        }

        return maxLen * maxLen;
    }
}
