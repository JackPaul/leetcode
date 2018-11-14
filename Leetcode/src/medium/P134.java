package medium;

public class P134 {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
    	
    	int[] sums = new int[gas.length];
    	for(int i = 0; i < gas.length; i++) {
    			sums[i] = gas[i] - cost[i];
    	}
    	
    	for(int i = 0; i < gas.length; i++) {
    		if(sums[i] < 0)
    			continue;
    		int total = sums[i];
    		int j = (i + 1) % gas.length;
    		boolean flag = true;
    		while(j != i) {
    			if(total < 0) {
    				flag = false;
    				break;
    			} else {
    				total += sums[j];
    				j = (j + 1) % gas.length;
    			}
    		}
    		if(flag && total >= 0)
    			return i;
    			
    	}
    	
		return -1;
    }
    
    public static void main(String[] args) {
//    	
//		int[] gas = {4,5,3,1,4};
//		int[] cost = {5,4,3,4,2};
//		System.out.println(canCompleteCircuit(gas, cost));
    	int i=0;
		for(i = 5; i >= 0; i--) {
			System.out.println(i);
		}
		System.out.println(i);
	}
}
