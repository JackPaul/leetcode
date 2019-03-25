package easy;

public class P231 {

    public boolean isPowerOfTwo(int n) {
    	if(n <= 0)
    		return false;
        return 1073741824 % n == 0;
    }

}
