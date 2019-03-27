package leetcode;

public class P633 {

    public boolean judgeSquareSum(int c) {

        if(isSquare(c))
        	return true;
        for(int i = 1; i<= (int)Math.sqrt(c); i++) {
        	if(isSquare(c - i*i))
        		return true;
        }
        return false;
    }
    
    boolean isSquare(int n) {
    	int i = (int)Math.sqrt(n);
    	return i * i == n;
    }
}
