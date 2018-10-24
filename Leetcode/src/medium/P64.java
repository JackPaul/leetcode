package medium;

public class P64 {

/*
 	³¬Ê±
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
	
}
