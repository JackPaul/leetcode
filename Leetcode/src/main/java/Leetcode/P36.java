package medium;

public class P36 {
    public static boolean isValidSudoku(char[][] board) {  
        for(int i = 0; i < 9; i++) {
        	int[] row = new int[9];
        	int[] col = new int[9];
        	for(int j = 0; j < 9; j++) {
        		if(board[i][j] != '.') {
        			if(row[board[i][j]-'1'] > 0)
        				return false;
        			row[board[i][j]-'1']++;
        		}
        		if(board[j][i] != '.') {
        			if(col[board[j][i]-'1'] > 0)
        				return false;
        			col[board[j][i]-'1']++;
        		}
        	}
        }
        
        
        for(int i = 0; i <= 6; i+=3) {
        	for(int j = 0; j <= 6; j+=3) {
        		int[] map = new int[9];
        		
        		for(int r = i; r < i + 3; r++) {
        			for(int c = j; c < j + 3; c++) {
                		if(board[r][c] != '.') {
                			if(map[board[r][c]-'1'] > 0) {
                				System.out.println("hah"+i+"  "+j+" "+r+" "+c);
                				return false;
                			}
                			if(i == 1 && j == 0)
                				System.out.println(board[r][c]);	
                			map[board[r][c]-'1']++;
                		}
        			}
        		}
        	}
        }
        return true;
    }
    
    public static void main(String[] args) {
    	char[][] board = {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
    	System.out.println(isValidSudoku(board));
	}
}
