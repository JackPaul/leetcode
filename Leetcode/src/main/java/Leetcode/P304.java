package medium;

public class P304 {
	class NumMatrix {
		int[][] matrixSum = null;
	    public NumMatrix(int[][] matrix) {
            	    	if(matrix.length == 0 || matrix[0].length == 0)
	    		return;
	    	matrixSum = new int[matrix.length][matrix[0].length];
	    	for(int i = 0; i < matrix.length; i++) {
	    		if(i > 0) {
	    			//matrixSum[0][i] = matrix[0][i] + matrixSum[0][i-1];
	    			matrixSum[i][0] = matrix[i][0] + matrixSum[i-1][0];
	    		} else {
	    			//matrixSum[0][i] = matrix[0][0];
	    			matrixSum[i][0] = matrix[0][0];
	    		}	
	    	}
	    	
	    	for(int i = 0; i < matrix[0].length; i++) {
	    		if(i > 0) {
	    			matrixSum[0][i] = matrix[0][i] + matrixSum[0][i-1];
	    			//matrixSum[i][0] = matrix[0][0] + matrixSum[i-1][0];
	    		} else {
	    			matrixSum[0][i] = matrix[0][0];
	    			//matrixSum[i][0] = matrix[0][0];
	    		}	
	    	}
	    	
	    	for(int i = 1; i < matrix.length; i++) {
	    		for(int j = 1; j < matrix[0].length; j++) {
	    			matrixSum[i][j] = matrix[i][j] + matrixSum[i-1][j] + matrixSum[i][j-1] - matrixSum[i-1][j-1];
	    		}
	    	}
	    }
	    
	    public int sumRegion(int row1, int col1, int row2, int col2) {
	        	    	if(matrixSum.length == 0 || matrixSum[0].length == 0)
	    		return 0;
            int a1 = row1 - 1;
	        int b1 = col1 - 1;
	        
	        
	    	int total = matrixSum[row2][col2];

	        if(row1 - 1 >= 0) {
	        	total -= matrixSum[row1-1][col2];
	        }
	        
	        if(col1 - 1 >= 0) {
	        	total -= matrixSum[row2][col1-1];
	        }
	        
	        if(a1 >= 0 && b1 >= 0) {
	        	total += matrixSum[a1][b1];
	        }
	        
	        return total;
	    }
	}
	
	public static void main(String[] args) {
		P304 p = new P304();
		int[][] a = {{1},{-7}};
		NumMatrix matrix = p.new NumMatrix(a);
		matrix.sumRegion(1, 0, 1, 0);
	}
}
