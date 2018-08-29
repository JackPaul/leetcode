package easy;

public class P867 {

	public int[][] transpose(int[][] A) {
        int[][] res = new int[A[0].length][A.length];
        for(int i = 0; i <= A[0].length-1; i++) {
        	for(int j = 0; j <= A.length-1; j++) {
        		res[i][j] = A[j][i];
        	}
        }
        return res;
    }

}
