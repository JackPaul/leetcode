package hard;

public class P37 {

    public boolean helper(char[][] board) {
        for(int i = 0; i < board.length; i++) {
        	for(int j = 0; j < board[0].length; j++) {
        		if(board[i][j] == ',') {
        			for(char k = '1'; i <= '9'; k++) {
        				if(isValid(board, i, j , k)) {
        					board[i][j] = k;
        					if(helper(board))
        						return true;
        					board[i][j] = ',';
        				}
        			}
        			return false;
        		}
        	}
        }
        return true;
    }

    private boolean isValid(char[][] board, int i, int j, char c){
    	//检查列
    	for(int l = 0; l < board.length; l++) {
    		if(board[l][j] == c)
    			return false;
    	}
    	//检查行
    	for(int l = 0; l < board[0].length; l++) {
    		if(board[i][l] == c)
    			return false;
    	}
    	//检查块
    	for(int row=i/3*3; row<i/3*3+3; row++)
    		for (int col=j/3*3; col<j/3*3+3; col++)
    		if (board[row][col]==c)
    			return false;
    	return true;
    }
    
}
