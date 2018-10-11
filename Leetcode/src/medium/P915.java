package medium;

public class P915 {
    public static int partitionDisjoint(int[] A) {
        int res = 0;
        int max = A[0];
        for(int i = 0; i < A.length; i++) {
        	max = max < A[i]?A[i]:max;
        	if(lessThanAll(max, A, i+1))
        		return i + 1;
        }
        return 0;
    }
    
    private static boolean lessThanAll(int i, int[] a, int j) {
		int k = 0;
    	for(k = j; k < a.length && a[k] >= i; k++)
    		;

		return k == a.length;
	}

	public static void main(String[] args) {
    	int[] A = { 5,0,3,8,6};
		System.out.println(partitionDisjoint(A));
	}
}
