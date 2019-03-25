package easy;

public class P832 {

//	 public static int[][] flipAndInvertImage(int[][] A) {   
//		 int[][] B = new int[A.length][A[0].length];
//		 for(int i = 0; i < A.length; i++) {
//			 for(int j = A[0].length-1; j >= 0; j--) {
//				 B[i][A[0].length-1-j] = A[i][j]>0?0:1;
//			 }
//		 }
//		 return B;
//	 }
//	 
	 public static int[][] flipAndInvertImage(int[][] A) {  
		 int a = 0;
		 for(int i = 0; i < A.length; i++) {
			 for(int j = 0; j <= (A[0].length - 1) / 2; j++) {
				 a = A[i][j] ^ 1;
				 A[i][j] = A[i][A[0].length-1-j] ^ 1;
				 A[i][A[0].length-1-j] = a;
			 }
		 }
		 return A;
	 }
	 
	 public static void main(String[] args) {
//		int A[][] = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
//		flipAndInvertImage(A);
//		 for(int i = 0; i < A.length; i++) {
//			 for(int j = 0; j < A[0].length; j++) {
//				 System.out.println(A[i][j]);
//			 }
//			 
//		 }
		 System.out.println(0^1);
	}

}
