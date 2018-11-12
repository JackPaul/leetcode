package medium;

public class P378 {
	/*
    public int kthSmallest(int[][] matrix, int k) {
        return kthSmallestHelper(matrix, k, 0, 0);
    }

	private int kthSmallestHelper(int[][] matrix, int k, int i, int j) {
		if(k == 1) {
			return matrix[i][j];
		}
		
		if(k > 2 * (matrix.length - i) - 1) {
			return kthSmallestHelper(matrix, k - 2 * (matrix.length - i)+1,  i+1, j+1);
		}
		
		int[] nums = new int[2 * (matrix.length - i) - 1];
		int count = 1;
		nums[0] = matrix[i][j];
		int j1 = j+1;
		int i1 = i+1;
	
		while(count != k) {
			while(i1 != matrix.length && j1 != matrix.length) {
				if(matrix[i][j1] < matrix[i1][j]) {
					nums[count++] = matrix[i][j1];
					j1++;
					if(count == k)
						break;
				} else {
					nums[count++] = matrix[i1][j1];
					i1++;
					if(count == k)
						break;
				}
			}
		}
		if(count == k)
			return nums[count-1];
		if(j1 == matrix.length)
			return matrix[i1+k-count][j];
		
		return matrix[i][j1+k-count];
	}
    */
	
	//求第k小  即求 n * n - + 1大
    public int kthSmallest(int[][] matrix, int k) {
        
    	int i = 0;
    	i = (int)Math.sqrt(k);
    	if(i * i == k)
    		return 
    	
    	return 0;
    }
    
}
