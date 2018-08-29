package easy;

public class P566 {

	public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(r * c != nums.length*nums[0].length)
        {
        	return nums;
        }else {
        	int[][] res = new int[r][c];
        	int currentRow=0, currentColumn=0;
        	for(int i = 0; i < nums.length; i++) {
        		for(int j = 0; j < nums[0].length; j++) {
        			res[currentRow][currentColumn] = nums[i][j];
        			currentColumn++;
        			if(currentColumn == c) {
        				currentColumn = 0;
        				currentRow++;
        			}
        		}
        	}
        	
        	return res;
        }
    }

}
