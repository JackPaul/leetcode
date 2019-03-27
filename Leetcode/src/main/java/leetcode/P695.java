package leetcode;

public class P695 {

	public static int maxAreaOfIsland(int[][] grid) {
      int res=0;
      int current=0;

      //calculateMaxAreaOfIsland(grid, r, l, current);
      for(int r = 0; r <= grid.length - 1; r++) {
    	  for(int c = 0; c <= grid[0].length - 1; c++) {
    		  current=0;
    		  if(grid[r][c] == 1) {
        		  current = calculateMaxAreaOfIsland(grid, r, c);
        		  res = res>current?res:current;
    		  }

    	  }
      }
      return res;
    }

	//计算单元值为1的点的岛面积
	public static int calculateMaxAreaOfIsland(int[][] grid, int r, int c) {

		if(r >= grid.length || r < 0 || c >= grid[0].length || c < 0  || grid[r][c] == 0) {
			return 0;
		} else {
			grid[r][c] = 0;
			return 1 + calculateMaxAreaOfIsland(grid, r-1, c)+ calculateMaxAreaOfIsland(grid, r+1, c)
			+ calculateMaxAreaOfIsland(grid, r, c-1)
			+ calculateMaxAreaOfIsland(grid, r, c+1);
		}

	}
	
	public static void main(String[] args) {
		int[][] a = {{1,1,0,0,0},{1,1,0,0,0},{0,0,0,1,1},{0,0,0,1,1}};
		System.out.println(maxAreaOfIsland(a));
	}

}
