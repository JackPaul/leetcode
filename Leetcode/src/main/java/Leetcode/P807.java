package medium;

public class P807 {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
    	if(grid.length == 1)
    		return 0;
        int res = 0;
        
        int d = grid.length;
        int[] xMax = new int[d];
        int[] yMax = new int[d];
        
        for(int i = 0; i < d; i++) {
        	int max = grid[i][0];
        	for(int j = 0; j < d ; j++) {
        		if(grid[i][j] > max)
        			max = grid[i][j];
        	}
        	xMax[i] = max;
        }
        
        for(int j = 0; j < d; j++) {
        	int max = grid[0][j];
        	for(int i = 0; i < d ; i++) {
        		if(grid[i][j] > max)
        			max = grid[i][j];
        	}
        	yMax[j] = max;
        }
        
        for(int i = 0; i < d; i++) {
        	for(int j = 0; j < d ; j++) {
        		int l = Math.min(xMax[i], yMax[j]);
        		res += l - grid[i][j];
        	}
        }
        return res;
    }
}
