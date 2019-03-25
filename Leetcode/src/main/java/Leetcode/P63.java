package medium;

public class P63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    	
    	int m = obstacleGrid.length;
    	int n = obstacleGrid[0].length;
    	if(obstacleGrid[m-1][n-1] == 1)
    		return 0;
    	if(m == 1) {
    		for(int i = 0; i < n; i++) {
    			if(obstacleGrid[0][i] == 1)
    				return 0;
    		}
    		return 1;	
    	}
    	
    	if(n == 1) {
    		for(int i = 0; i < m; i++) {
    			if(obstacleGrid[i][0] == 1)
    				return 0;
    		}
    		return 1;	
    	}
        int[][] dp = new int[m][n];
        dp[m-1][n-1] = 0;
        int i=0;
        for(i = n - 1; i >= 0; i--) {
        	if(obstacleGrid[m-1][i] == 0)
        		dp[m-1][i] = 1;
        	else {
        		dp[m-1][i] = 0;
        		break;
        	}	
        }
        if(i > 0) {
        	for(int j = 0; j < i; j++)
        		dp[m-1][i] = 0;
        }
        
        i = 0;
        for(i = m - 1; i >= 0; i--) {
        	if(obstacleGrid[i][n-1] == 0)
        		dp[i][n-1] = 1;
        	else {
        		dp[i][n-1] = 0;
        		break;
        	}
        }
        
        if(i > 0) {
        	for(int j = 0; j < i; j++)
        		dp[j][n-1] = 0;
        }
        
        for(i = m - 2; i >= 0; i--) {
	    	for(int j = n - 2; j >= 0; j--) {
	    		if(obstacleGrid[i][j] == 1)
	    			dp[i][j] = 0;
	    		else 
	    			dp[i][j] = dp[i+1][j] + dp[i][j+1];
	    	}
       }
       return dp[0][0];
    }
}
