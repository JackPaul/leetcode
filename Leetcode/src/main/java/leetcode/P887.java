package leetcode;

public class P887 {

	 public static int projectionArea(int[][] grid) {

	     int xyNum = 0, xzNum = 0, yzNum = 0;
	     int rowMax = 0;
	     for(int i = 0; i < grid.length; i++) {
	    	 rowMax = grid[i][0];
	    	 for(int j = 0; j < grid[i].length; j++) {
	    		 if(grid[i][j] > 0) {
	    			 xyNum++;
	    			 //加上每行最大值
	    			 if(grid[i][j] > rowMax) {
	    				 rowMax = grid[i][j];;
	    			 }
	    		 } 
	    	 }
	    	 yzNum += rowMax;	 
	     }
	     
	     //加上每列最大值
	     int columnMax = 0;
	     for(int i = 0; i < grid[0].length; i++) {
	    	 columnMax = grid[0][i];
	    	 for(int j = 0; j < grid.length; j++) {
	    		 if(grid[j][i] > 0) {
	    			 //加上每行最大值
	    			 if(grid[j][i] > columnMax) {
	    				 columnMax = grid[j][i];
	    			 }
	    		 } 
	    	 }
	    	 xzNum += columnMax;	 
	     }
		 return xyNum+xzNum+yzNum;
	 }
	 
	 public static void main(String[] args) {
		int[][] grid = {{1,0},{5,4}};
		System.out.println(projectionArea(grid));
	}

}
