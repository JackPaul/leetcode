package medium;

public class P240 {
	 public static boolean searchMatrix(int[][] matrix, int target) {
	    	if(matrix.length == 0)
	    		return false;
	        return searchMatrix(matrix, target, 0, 0, matrix.length-1, matrix[0].length-1);
	    }

		private static boolean searchMatrix(int[][] matrix, int target, int i, int j, int k, int l) {
			if(i < 0 || i > matrix.length - 1 || j < 0 || j > matrix[0].length-1 || k < 0 || k > matrix.length - 1 || l < 0 || l > matrix[0].length-1 || i > k || j > l)
				return false;
			
			if(i == k) {
				for(int m = j; m <= l; m++)
					if(matrix[i][m] == target)
						return true;
				return false;
			}
			
			if(j == l) {
				for(int m = i; m <= k; m++)
					if(matrix[m][j] == target)
						return true;
				return false;
			}
			
			if(matrix[i][j] == target)
				return true;
			if(matrix[k][l] == target)
				return true;
			
			int i1 = (i + k) / 2;
			int j1 = (j + l) / 2;
			if(matrix[i1][j1] == target)
				return true;
			if(matrix[i1][j1] < target) {
				//遍历右下
				for(int m = i1; m <= k; m++)
					if(matrix[m][j1] == target)
						return true;
				for(int m = j1; m <= l; m++)
					if(matrix[i1][m] == target)
						return true;
				return searchMatrix(matrix, target, i1+1, j1+1, k, l) || searchMatrix(matrix, target, i1+1, j, k, j1-1) || searchMatrix(matrix, target, i, j1+1, i1-1, l);
			}
			else {
				//遍历左上
				//遍历右下
				for(int m = i1; m >= i; m--)
					if(matrix[m][j1] == target)
						return true;
				for(int m = j1; m >= j; m--)
					if(matrix[i1][m] == target)
						return true;
				return searchMatrix(matrix, target, i, j, i1-1, j1-1) || searchMatrix(matrix, target, i1+1, j, k, j1-1) || searchMatrix(matrix, target, i, j1+1, i1-1, l);
			}
	    }
}
