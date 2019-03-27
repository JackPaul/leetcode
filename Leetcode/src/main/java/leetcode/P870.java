package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P870 {

    public static int[] advantageCount(int[] A, int[] B) {
        int[] copyA = Arrays.copyOfRange(A, 0, A.length);
        
        Arrays.sort(copyA);
        
        
        
        
       
        boolean flag[] = new boolean[A.length];
        int i = 0;
        int left = -1;
        for(int k = 0; k < B.length; k++) {
        	
        	for(i = 0; i < copyA.length; i++) {
        		if(left == -1 && !flag[i])
        			left = i;
        		if(!flag[i] && copyA[i] > B[k])
        			break;
        	}
        	
        	if(i == copyA.length)
        		i = left;
        	flag[i] = true;
        	A[k] = copyA[i];
        }
        

        return A;
    }
    
    public static void main(String[] args) {
		int A[] = {8,2,4,4,5,6,6,0,4,7};
		int B[] = {0,8,7,4,4,2,8,5,2,0};
		System.out.println(Arrays.toString(advantageCount(A, B)));
	}

}
