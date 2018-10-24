package medium;

public class P861 {
    public static int matrixScore(int[][] A) {
        int res = 0;
        
        //让第一列1 尽可能多
        for(int i = 0; i < A.length; i++) {
        	if(A[i][0] == 0) {
        		for(int j = 0; j < A[0].length; j++) {
        			A[i][j] = 1 - A[i][j];
        		}
        	}
        }
        int sum = 0;
        //翻转行  让每列1尽量多
        for(int j = 1; j < A[0].length; j++) {
        	sum = 0;
        	for(int i = 0; i < A.length; i++) {
        		sum += A[i][j];
        	}
        	if(sum < (A.length + 1) / 2) {
            	for(int i = 0; i < A.length; i++) {
            		A[i][j] = 1 - A[i][j];
            	}
        	}
        }
        
    	for(int i = 0; i < A.length; i++) {
    		res += bytesToInt(A[i]);
    	}
        return res;
    }

	public static int bytesToInt(int[] a) {
    	int res = 0;
    	for(int i = 0; i < a.length; i++) {
    		res = res * 2 + a[i];
    	}
    	
    	return res;
    }
    
    
    public static void main(String[] args) {
		int[][] A = {{0,0,1,1},{1,0,1,0},{1,1,0,0}};
		System.out.println(matrixScore(A));
	}
    
}

