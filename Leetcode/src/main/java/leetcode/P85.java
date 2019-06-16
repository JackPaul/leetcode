package leetcode;

public class P85 {

	public static int maximalRectangle(char[][] matrix) {
		if(matrix.length == 0)
			return 0;

		int row = matrix.length;
		int col = matrix[0].length;
		int[][] dp = new int[row][col];
		dp[0][0] = matrix[0][0]=='1'?1:0;
		int max = dp[0][0];
		for(int i = 1; i < row; i++) {
			if(matrix[i][0] == '1') {
				dp[i][0] = dp[i-1][0]+1;
				if(dp[i][0] > max)
					max = dp[i][0];
			}
		}
		for(int i = 1; i < col; i++) {
			if(matrix[0][i] == '1') {
				dp[0][i] = dp[0][i-1]+1;
				if(dp[0][i] > max)
					max = dp[0][i];
			}
		}
		for(int i = 1; i < row; i++) {
			for(int j = 1; j < col; j++) {
				if(matrix[i][j] == '1') {
					if(matrix[i-1][j-1] == '1') {
						if(matrix[i-1][j] == '0' && matrix[i][j-1] == '0'){
							dp[i][j] = 1;
						} else
							dp[i][j] = dp[i][j-1] + dp[i-1][j] - dp[i-1][j-1] + 1;

					} else {
						int currentMax = 0;
						int total = 0;
						for(int k = i; k >= 0; k--) {
							if (matrix[k][j] == '1') {
								total++;
							} else {
								break;
							}
						}
						if(total > currentMax)
							currentMax = total;
						total = 0;
						for(int k = j; k >= 0; k--) {
							if (matrix[i][k] == '1') {
								total++;
							} else {
								break;
							}
						}
						if(total > currentMax)
							currentMax = total;
						dp[i][j] = currentMax;
					}

				}
				if(dp[i][j] > max)
					max = dp[i][j];
			}
		}

		return max;
	}
    
    public static void main(String[] args) {
		/**
		 * [['1','0','1','2','0','1'],
		 * ['2','2','3','4','1','1'],
		 * ['0','1','1','0','1','1'],
		 * ['1','1','1','0','1','0'],
		 * ['0','1','1','1','1','1'],
		 * ['1','1','0','1','1','1']]
		 */

		char[][] matrix =
				{{'1','0','1','1','0','1'},
				{'1','1','1','1','1','1'},
				{'0','1','1','0','1','1'},
				{'1','1','1','0','1','0'},
				{'0','1','1','1','1','1'},
				{'1','1','0','1','1','1'}};
		System.out.println(maximalRectangle(matrix));
	}

}
