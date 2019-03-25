package medium;

public class P413 {
    public static int numberOfArithmeticSlices(int[] A) {
        if(A.length < 3)
            return 0;
        int res = 0;
        int i = 0;
        int j = i+2;
        int d = A[i+1] - A[i];
        int len = 0;
        while(j < A.length) {
        	if(A[j] - A[j-1] == d) {
        		j++;
        	} else {

        		len = j - i;
        		if(len >= 3) {
        			res += (len - 2) * (len - 1) / 2;
        		}
        		
        		i = j - 1;
        		d = A[j] - A[i];
        		j++;
        	}
        }
        len = j - i;
        if(len >= 3)
        	res += (len - 2) * (len - 1) / 2;
        
        return res;
    }
    
    public static void main(String[] args) {
		int[] A = {1,2,3,4};
		System.err.println(numberOfArithmeticSlices(A));
	}
}
