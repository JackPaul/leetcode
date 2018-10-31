package medium;

import java.util.HashMap;
import java.util.Map;

public class P79 {
    public static boolean exist(char[][] board, String word) {
       	for(int i = 0; i < board.length; i++) {
       		for(int j = 0; j < board[0].length; j++) {
       			int[][] visited = new int[board.length][board[0].length];
       			if(dfs(board, i, j, word, visited))
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
//			System.out.println(word+" "+i+"  "+j+"  "+false);
			return false;
		}
				
		String str = word.substring(1);
		visited[i][j] = 1;
		return dfs(board, i+1, j, str, visited) || dfs(board, i-1, j, str, visited) || dfs(board, i, j+1, str, visited) || dfs(board, i, j-1, str, visited);
	}

	public static void main(String[] args) {
//		char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		char[][] board = {{'a','a'}};
				
		System.out.println(exist(board, "aaa"));
	}
}
