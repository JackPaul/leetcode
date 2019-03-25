package easy;

public class P896 {
    public boolean isMonotonic(int[] A) {
        if(A.length <= 1)
        	return true;
        
        int flag = 0;//0 undecided 1 increasing -1: decreasing;
        
        for(int i = 1; i < A.length; i++) {
        	if(flag == 0) {
        		if(A[i] > A[i-1])
        			flag = 1;
        		if(A[i] < A[i-1])
        			flag = -1;
        	} else if(flag == -1){
        		if(A[i] > A[i-1])
        			return false;
        	} else {
        		if(A[i] < A[i-1])
        			return false;
        	}
        }
        return true;
    }
    
}
