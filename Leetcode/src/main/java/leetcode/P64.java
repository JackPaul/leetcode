package leetcode;

public class P64 {

/*
 	��ʱ
    public static int minPathSum(int[][] grid) {
        int[] min = new int[1];
        min[0] = Integer.MAX_VALUE;
        minPathSum(grid, 0, 0, 0, min);
        return min[0];
    }

	private static void minPathSum(int[][] grid, int i, int j, int sum, int[] min) {
		if(i >= grid.length || j >= grid[0].length)
			return;
		sum += grid[i][j];
		if(i == grid.length - 1 && j == grid[0].length - 1) {
			if(sum < min[0])
				min[0] = sum;
		} else {
			if(sum >= min[0])
				return;
			if(i == grid.length - 1) {
				minPathSum(grid, i, j+1, sum, min);
			}	
			else if(j == grid[0].length - 1) {
				minPathSum(grid, i+1, j, sum, min);
			}
			else {
				minPathSum(grid, i, j+1, sum, min);
				minPathSum(grid, i+1, j, sum, min);
			}   
		}
		sum -= grid[i][j];
	}
*/
    public static int minPathSum(int[][] grid) {
    	int m = grid.length;
    	int n = grid[0].length;
    	
    	int[][] dp = new int[m][n];
    	dp[m-1][n-1] = grid[m-1][n-1];
    	
    	for(int i = n - 2; i >= 0; i--) {
    		dp[m-1][i] = grid[m-1][i] + dp[m-1][i+1];
    	}
    	
    	for(int i = m - 2; i >= 0; i--) {
    		dp[i][n-1] = grid[i][n-1] + dp[i+1][n-1];
    	}
    	
    	for(int i = m - 2; i >= 0; i--) {
    		for(int j = n - 2; j >= 0; j--) {
    			dp[i][j] = grid[i][j] + Math.min(dp[i][j+1], dp[i+1][j]);
    		}
    	}
    	
    	return dp[0][0];
    }
    
    public static void main(String[] args) {
		int[][] grid = {{1,3,1},{1,5,1}, {4,2,1}};
		System.out.println(minPathSum(grid));
	}
}
