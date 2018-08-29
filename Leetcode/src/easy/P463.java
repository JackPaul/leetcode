package easy;

public class P463 {

//	public static int islandPerimeter(int[][] grid) {
//		 int res=0;
//		 int row = grid.length;
//		 int column = grid[0].length;
//		 for(int i = 0; i < row; i++) {
//			 for(int j = 0; j < column; j++) {
//				 if(grid[i][j] == 1) {
//					 if(i-1 < 0)
//						 res++;
//					 else
//						 res += grid[i-1][j]==0?1:0;
//					 
//					 if(i+1 == row)
//						 res++;
//					 else
//						 res += grid[i+1][j]==0?1:0;
//					 
//					 if(j-1 < 0)
//						 res++;
//					 else
//						 res += grid[i][j-1]==0?1:0;
//					 
//					 if(j+1 == column)
//						 res++;
//					 else
//						 res += grid[i][j+1]==0?1:0;	
//				 } 
//			 }
//		 }
//		 
//		 return res;
//	 }
	
	 public static int islandPerimeter(int[][] grid) {
	        int peri =0;
	        for(int i=0;i<grid.length;i++){
	            for(int j=0;j<grid[0].length;j++){
	                if(grid[i][j]==0) continue;
	                peri += check(grid, i, j-1);
	                peri += check(grid, i, j+1);
	                peri += check(grid, i+1, j);
	                peri += check(grid, i-1, j);
	            }
	        }
	        return peri;
	    }
	    
	    public static int check(int[][] grid, int i, int j){
	        if(i<grid.length && i >= 0 && j<grid[0].length && j>=0){
	            if(grid[i][j]==0) return 1;
	            else return 0;
	        } else{
	            return 1;
	        }
	          
	        
	    }
	 
	 public static void main(String[] args) {
		int[][] a = {{0,1,0,0},
				 {1,1,1,0},
				 {0,1,0,0},
				 {1,1,0,0}};
		int[][] b = {{1}};
		System.out.println(islandPerimeter(a));
		
	}

}
