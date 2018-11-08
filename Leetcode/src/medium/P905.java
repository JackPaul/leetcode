package medium;

public class P905 {
    public int[] sortArrayByParity(int[] A) {
        int i= 0;
        int j = A.length - 1;
        while(i < j) {
        	if(A[i] % 2 == 0)
        		i++;
        	else if(A[j] % 2 == 1) {
        		j--;
        	} else {
        		int c = A[i];
        		A[i] = A[j];
        		A[j] = c;
        		i++;
        		j--;
        	}
        }
        return A;
    }
}
