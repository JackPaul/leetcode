package leetcode;

public class P766 {

	public boolean isToeplitzMatrix(int[][] matrix) {
        //boolean res = true;
        int row = matrix.length;
        int column = matrix[0].length;
        int m = 0, n = 0;
        for(n = 0;  n < column; n++) {
        	m = 0;
        	int x=m, y=n;
        	while(x < row &&  y < column) {
        		if(matrix[x][y] != matrix[m][n]) {
        			//res = false;
        			return false;
        		} else {
        			x++;
        			y++;
        		}
        	}
        }
        
        for(m = 0;  m < row; m++) {
        	n = 0;
        	int x=m, y=n;
        	while(x < row &&  y < column) {
        		if(matrix[x][y] != matrix[m][n]) {
        			//res = false;
        			return false;
        		} else {
        			x++;
        			y++;
        		}
        	}
        }
        return true;
    }

}
