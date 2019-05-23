package leetcode;

/**
 * @author jackpaul <jiekepao@gmail.com>
 * Created on 2019-04-18 21:31
 * @Description:
 */
public class P289 {

    /**
     * 从活变死-1， 从死变活2
     * @param board
     */
    public void gameOfLife(int[][] board) {

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                int i1 = i - 1;
                int i2 = i + 1;
                int j1 = j - 1;
                int j2 = j + 1;
                int liveNeighbors = 0;
                liveNeighbors += check(board, i - 1, j - 1);
                liveNeighbors += check(board, i - 1, j);
                liveNeighbors += check(board, i - 1, j + 1);
                liveNeighbors += check(board, i, j - 1);
                liveNeighbors += check(board, i, j + 1);
                liveNeighbors += check(board, i + 1, j - 1);
                liveNeighbors += check(board, i + 1, j);
                liveNeighbors += check(board, i + 1, j + 1);
                if(board[i][j] == 0){
                    if(liveNeighbors == 3) {
                        board[i][j] = 2;
                    }
                } else {
                    if(liveNeighbors < 2 || liveNeighbors > 3){
                        board[i][j] = -1;
                    }
                }
            }
        }

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] > 0) {
                    board[i][j] = 1;
                } else {
                    board[i][j] = 0;
                }
            }
        }
    }

    private int check(int[][] board, int i, int j) {
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length)
            return 0;
        return (board[i][j] == 1 || board[i][j] == -1)?1:0;
    }
}
