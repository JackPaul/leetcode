package easy;

public class P467 {

	 public static int findComplement(int num) {
	     int binaryStringLength = 1;
	     int n = num;
	     int b = 2;
	     while(n > 1) {
	    	 binaryStringLength += 1;
	    	 n = n >> 1;
	    	 b *= 2;
	     }   
		 return (~num) & (b-1);
	 }
	 
	 public static void main(String[] args) {
		 findComplement(7);
	}
}
