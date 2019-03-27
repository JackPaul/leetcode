package leetcode;

public class P598 {

    public static int maxCount(int m, int n, int[][] ops) {
    	if(ops.length == 0)
    		return m * n;
    	int rowMin = ops[0][0];
    	int columnMin = ops[0][1];
        for(int i = 1; i < ops.length; i++) {
        	rowMin = rowMin>ops[i][0]?ops[i][0]:rowMin;
        	columnMin = columnMin>ops[i][1]?ops[i][1]:columnMin;
        }
        return rowMin*columnMin;
    }
    
    public static void main(String[] args) {
    	int[][] a = {{2,2}, {3,3}};
		System.out.println(maxCount(3,3,a));
	}
}
