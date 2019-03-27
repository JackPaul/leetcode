package leetcode;

public class P931 {
    public static int minFallingPathSum(int[][] A) {
        int[][] B = new int[A.length][A[0].length];
        
        int min = Integer.MAX_VALUE;
        for(int i = 0;  i < B[0].length; i++) {
        	B[B.length-1][i] = A[B.length-1][i];
        	if(A.length == 1)
        		min = min>B[B.length-1][i]?B[B.length-1][i]:min;
        }
        
        
        for(int i = B.length-2; i >= 0; i--) {
        	for(int j = 0; j < B[0].length; j++) {
        		if(j == 0)
        			B[i][j] = A[i][j] + Math.min(B[i+1][j], B[i+1][j+1]);
        		else if(j == B[0].length-1)
        			B[i][j] = A[i][j] + Math.min(B[i+1][j], B[i+1][j-1]);
        		else
        			B[i][j] = A[i][j] + min(B[i+1][j], B[i+1][j+1], B[i+1][j-1]);
        		
        		if(i == 0 && B[i][j] < min)
        			min = B[i][j];
        	}
        }
        return min;
    }

	private static int min(int i, int j, int k) {
		if(i < j) {
			if(j < k) {
				return i;
			} else {
				if(i < k)
					return i;
				else
					return k;
			}

		} else {
			if(i < k) {
				return j;
			} else {
				if(j < k)
					return j;
				else
					return k;
			}
		}
	}
	
	public static void main(String[] args) {

		int[][] A = {{-80, -13, 22}, {83,94,-5}, {73,-48,61}};
		System.out.println(minFallingPathSum(A));
	}
}
