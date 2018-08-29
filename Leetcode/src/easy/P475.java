package easy;

public class P475 {

    public static int findRadius(int[] houses, int[] heaters) {

        int res = heaters[0] - houses[0];
        while(res < houses[houses.length-1]) {
        	for(int j = 0; j < heaters.length - 1 && heaters[j] < houses[houses.length-1]; j++) {
        		if(heaters[j+1] - heaters[j] > 2 * res) {
        			res++;
        			break;
        		}
        	}
        	if(houses[houses.length-1] - heaters[heaters.length - 1] > res) {
        		res++;
        	} else {
        		break;
        	}

        }
        
        return res;
    }
    
    public static void main(String[] args) {
    	int[] a = {1, 5};
    	int[] b = {2};
    	
    	System.out.println(findRadius(a, b));
	}

}
