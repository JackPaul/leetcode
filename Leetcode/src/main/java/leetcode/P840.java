package leetcode;

public class P840 {
    public static int numMagicSquaresInside(int[][] grid) {
        if(grid.length < 3 || grid[0].length < 3)
        	return 0;
        
        int res = 0;
        
        for(int i = 0; i <= grid.length - 3; i++) {
        	for(int j = 0; j <= grid[0].length - 3; j++) {
        		if(grid[i][j] < 1 || grid[i][j] > 9 || grid[i][j+1] < 1 || grid[i][j+1] > 9 || grid[i][j+2] < 1 || grid[i][j+2] > 9 || 
        				grid[i+1][j] < 1 || grid[i+1][j] > 9 || grid[i+1][j+1] < 1 || grid[i+1][j+1] > 9 || grid[i+1][j+2] < 1 || grid[i+1][j+2] > 9 ||
        				grid[i+2][j] < 1 || grid[i+2][j] > 9 || grid[i+2][j+1] < 1 || grid[i+2][j+1] > 9 || grid[i+2][j+2] < 1 || grid[i+2][j+2] > 9) {
        			continue;
        		}
        		
        		int[] nums = new int[9];
        		nums[grid[i][j] - 1] = 1;nums[grid[i][j+1] - 1] = 1;nums[grid[i][j+2] - 1] = 1;
        		nums[grid[i+1][j] - 1] = 1;nums[grid[i+1][j+1] - 1] = 1;nums[grid[i+1][j+2] - 1] = 1;
        		nums[grid[i+2][j] - 1] = 1;nums[grid[i+2][j+1] - 1] = 1;nums[grid[i+2][j+2] - 1] = 1;
        		if(sum(nums) != 9)
        			continue;
        		
        		int a0 = grid[i][j] + grid[i][j+1] + grid[i][j+2];
        		int a1 = grid[i+1][j] + grid[i+1][j+1] + grid[i+1][j+2];
        		int a2 = grid[i+2][j] + grid[i+2][j+1] + grid[i+2][j+2];
        		int a3 = grid[i][j] + grid[i+1][j] + grid[i+2][j];
        		int a4 = grid[i][j+1] + grid[i+1][j+1] + grid[i+2][j+1];
        		int a5 = grid[i][j+2] + grid[i+1][j+2] + grid[i+2][j+2];
        		int a6 = grid[i][j] + grid[i+1][j+1] + grid[i+2][j+2];
        		int a7 = grid[i+2][j] + grid[i+1][j+1] + grid[i][j+2];
        		if(a1 == a0 && a2 == a0 && a3 == a0 && a4 == a0 &&
        			a5 == a0 && a6 == a0 && a7 == a0) {
        			res++;
        		}
        	}
        }
        
        return res;
    }

	private static int sum(int[] nums) {
		int res = 0;
		for(int i : nums)
			res += i;
		return res;
	}
    
    public static void main(String[] args) {
    	int[][] grid = {{7,2,9,7},{8,4,10,1},{3,2,5,8},{10,9,0,6}};
		System.out.println(numMagicSquaresInside(grid));
	}
}
