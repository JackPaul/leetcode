package medium;

public class P130 {
    public static void solve(char[][] board) {
        for(int i = 0; i < board.length; i++) {
        	for(int j = 0; j < board[0].length; j++) {
        		if(board[i][j] == 'O') {
        			captured(board, i, j);
        		}
        	}
        }
        
        System.out.println(1334);
    }

	private static boolean captured(char[][] board, int i, int j) {
		System.out.println(i+"  "+ j);
		if(i <= 0 || j <= 0 || i >= board.length - 1 || j >= board[0].length - 1) {
			return false;
		}
		if(board[i][j] == 'X')
			return true;
		else {
			boolean res = true;
			if(i - 1 >= 0 && board[i-1][j] == 'O') {
				res = res && captured(board, i-1, j);
			}
			if(i+1 < board.length && board[i+1][j] == 'O') {
				res = res && captured(board, i+1, j);
			}
			if(j - 1 >= 0 && board[i][j-1] == 'O') {
				res = res && captured(board, i, j-1);
			}
			if(j + 1 < board[0].length && board[i][j+1] == 'O') {
				res = res && captured(board, i, j+1);
			}
			if(res)
				board[i][j] = 'X';
			return res;
		}
	}
	
	public static void main(String[] args) {
//		char[][] board = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
		char[][] board = {{'0','0','0','0'},{'0','O','O','0'},{'0','0','O','0'},{'0','O','0','0'}};
		solve(board);
	}
}
