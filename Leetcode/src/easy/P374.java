package easy;

public class P374 {
	int guess(int num) {
		return 0;
	}
    public int guessNumber(int n) {
        if(n == 1)
    		return 1;
        int low = 1;
        int high = n;
        int center = 0;
        int f;
        while(low <= high) {
        	center = (low + high) >>> 1;	
        	f = guess(center);
        	if(f == 0)
        		return center;
        	if(f == 1) {
        		low = center + 1;
        	} else {
                high = center - 1;
        	}
        }
          
        return -1;
    }

}
