package leetcode;

public class P888 {

    public static int[] fairCandySwap(int[] A, int[] B) {
        int[] a = new int[100001];
        int[] b = new int[100001];
        int[] res = new int[2];
        int maxA = 0;
        int totalA = 0, totalB = 0;
        for(int i = 0; i < A.length; i++) {
        	totalA += A[i];
        	a[A[i]]++;
        	maxA = maxA>A[i]?maxA:A[i];
        }
        	
        for(int i = 0; i < B.length; i++) {
        	totalB += B[i];
        	b[B[i]]++;
        }
        	
        int diff = totalA - totalB;
        for(int i = 0; i <= maxA; i++) {
        	if(a[i] > 0 && (i - diff / 2) >= 0 &&  b[i - diff / 2] > 0) {
        		
        		res[0] = i;
        		res[1] = i - diff / 2;
        		break;
        	}
        		
        }
        return res;
    }
    
    public static void main(String[] args) {
		int[] a = {1, 1};
		int[] b = {2, 2};
		System.out.println(fairCandySwap(a, b));
	}
}
