package medium;

import java.util.HashMap;
import java.util.Map;

public class P79 {
    public static boolean exist(char[][] board, String word) {
    	if(word.length() > board.length * board[0].length)
    		return false;
       	for(int i = 0; i < board.length; i++) {
       		for(int j = 0; j < board[0].length; j++) {
       			int[][] visited = new int[board.length][board[0].length];
       			if(board[i][j] == word.charAt(0) && dfs(board, i, j, word, visited))
       				return true;
       		}
       	}
        return false;
    }

	private static boolean dfs(char[][] board, int i, int j, String word, int[][] visited) {
		//		System.out.println(word+".....***");
		if(word.length() == 0) {
			return true;
		}
			
		if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(0) || visited[i][j] == 1) {
			return false;
		}
				
		String str = word.substring(1);
		visited[i][j] = 1;
		boolean flag = dfs(board, i+1, j, str, visited) || dfs(board, i-1, j, str, visited) || dfs(board, i, j+1, str, visited) || dfs(board, i, j-1, str, visited);
		if(flag == false) {
			visited[i][j] = 0;
		}
		return flag;
	}

	public static void main(String[] args) {
		char[][] board = {{'A','B','C','E'},{'S','F','E','S'},{'A','D','E','E'}};
				
		System.out.println(exist(board, "ABCESEEEFS"));
	}
}
