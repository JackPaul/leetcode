package medium;

public class P200 {
    public static int numIslands(char[][] grid) {
        int res = 0;
        
        for(int i = 0; i < grid.length; i++) {
        	for(int j = 0; j < grid[0].length; j++) {
        		if(grid[i][j] == '1') {
        			res++;
        			bfs(grid, i, j);
        		}
        	}
        }
        return res;
    }

	private static void bfs(char[][] grid, int i, int j) {
		if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length)
			return;
		if(grid[i][j] == '0')
			return;
		grid[i][j] = '0';
		bfs(grid, i + 1, j);
		bfs(grid, i - 1, j);
		bfs(grid, i, j - 1);
		bfs(grid, i, j + 1);		
	}
	
	public static void main(String[] args) {
		char[][] grid = {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
		System.out.println(numIslands(grid));
	}
	
}
