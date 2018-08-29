package easy;

public class P661 {

    public int[][] imageSmoother(int[][] M) {
    	int row = M.length;
    	int col = M[0].length;
        int[][] res = new int[row][col];
        
        if(row == 1 && col == 1)
        	res[0][0] = M[0][0];
        else if(row == 1 && col != 1) {
        	for(int j = 0; j < col; j++) {
        		if(j == 0) {
        			res[0][j] = (M[0][j] + M[0][j+1]) / 2;
        		} else if(j == col - 1) {
        			res[0][j] = (M[0][j] + M[0][j-1]) / 2;
        		} else {
        			res[0][j] = (M[0][j] + M[0][j+1] + M[0][j-1]) / 3;
        		}
        	}
        	
        } else if(row != 1 && col == 1) {
        	for(int j = 0; j < row; j++) {
        		if(j == 0) {
        			res[j][0] = (M[j][0] + M[j+1][0]) / 2;
        		} else if(j == row - 1) {
        			res[j][0] = (M[j][0] + M[j-1][0]) / 2;
        		} else {
        			res[j][0] = (M[j][0] + M[j-1][0]+ M[j+1][0]) / 3;
        		}
        	}
        } else {
            for(int i = 0; i < row; i++) {
            	for(int j = 0; j < col; j++) {
            		if(i == 0) {
            			if(j == 0) {
                			res[i][j] = (M[i][j] + M[i+1][j] + M[i][j+1] + M[i+1][j+1]) / 4;
                		} else if(j == col - 1) {
                			res[i][j] = (M[i][j] + M[i+1][j] + M[i][j-1] + M[i+1][j-1]) / 4;
                		} else {
                			res[i][j] = (M[i][j-1] + M[i][j] + M[i][j+1] + M[i+1][j-1] + M[i+1][j] + M[i+1][j+1]) / 6;
                		}
            		} else if(i == row - 1) {
            			if(j == 0) {
            				res[i][j] = (M[i-1][j] + M[i-1][j+1] + M[i][j] + M[i][j+1]) / 4;
                		} else if(j == col - 1) {
                			res[i][j] = (M[i-1][j-1] + M[i-1][j] + M[i][j-1] + M[i][j]) / 4;
                		} else {
                			res[i][j] = (M[i-1][j-1] + M[i-1][j] + M[i-1][j+1] + M[i][j-1] + M[i][j] + M[i][j+1]) / 6;
                		}
            		} else {
            			if(j == 0) {
            				res[i][j] = (M[i-1][j] + M[i-1][j+1] + M[i][j] + M[i][j+1] + M[i+1][j] + M[i+1][j+1]) / 6;
                		} else if(j == col - 1) {
                			res[i][j] = (M[i-1][j-1] + M[i-1][j] + M[i][j-1] + M[i][j] + M[i+1][j-1] + M[i+1][j]) / 6;
                		} else {
                			res[i][j] = (M[i-1][j-1] + M[i-1][j] + M[i-1][j+1] + M[i][j-1] + M[i][j] + M[i][j+1] + M[i+1][j-1] + M[i+1][j] + M[i+1][j+1]) / 9;
                		}
            		}
            	}
            } 
        }   
        return res;
    }
}
