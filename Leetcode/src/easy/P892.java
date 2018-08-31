package easy;

public class P892 {
    public static int surfaceArea(int[][] grid) {
        if(grid.length == 1)
        	return 2 + grid[0][0] * 4;
        
        int res = 0;
        int len = grid.length;
        for(int i = 0; i < len; i++) {
        	res += grid[i][0];
        	res += grid[i][len-1];
        }

        for(int i = 0; i < len; i++) {
        	res += grid[0][i];
        	res += grid[len-1][i];
        }
        

        for(int i = 0; i < len; i++) {
        	for(int j = 0; j < len; j++) {
        		if(grid[i][j] > 0)
        			res += 2;
        		res += findDiff(grid, i, j);
        	}
        }
        return res;
    }

	private static int findDiff(int[][] grid, int i, int j) {
		int res = 0;
		int len = grid.length;
		int x1 = i - 1, x2 = i + 1;
		int y1 = j - 1, y2 = j + 1;
		
		if(x1 >= 0  && grid[i][j] > grid[x1][j])
			res += grid[i][j] - grid[x1][j];
		
		if(x2 < len && grid[i][j] > grid[x2][j])
			res += grid[i][j] - grid[x2][j];
		
		if(y1 >= 0 && grid[i][j] > grid[i][y1])
			res += grid[i][j] - grid[i][y1];
		
		if(y2 < len && grid[i][j] > grid[i][y2])
			res += grid[i][j] - grid[i][y2];

		return res;
	}
	
	public static void main(String[] args) {
		int[][] grid = {{1,2},{3,4}};
		System.out.println(surfaceArea(grid));
	}
}
