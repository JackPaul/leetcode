package medium;

public class P746 {
    public static int minCostClimbingStairs(int[] cost) {
        int res = 0;
        
        if(cost.length == 0)
        	return 0;
        if(cost.length == 1)
        	return cost[0];
        if(cost.length == 2) {
        	return cost[0]<cost[1]?cost[0]:cost[1];
        }
        
        //从0开始
        int cost1[] = new int[cost.length];
        //从1开始
        int cost2[] = new int[cost.length];
        
        cost1[0] = cost[0];
        cost1[1] = cost[1];
        cost1[2] = cost[0]+cost[2];
        for(int i = 3; i < cost.length; i++) {
        	cost1[i] = cost[i] + cost1[i-2]<cost1[i-1]?cost[i] + cost1[i-2]: cost1[i-1];
        }
        
        cost2[0] = 0;
        cost2[1] = cost[1];
        cost2[2] = cost[1];
        for(int i = 3; i < cost.length; i++) {
        	cost2[i] = cost[i] + cost2[i-2]<cost2[i-1]?cost[i] + cost2[i-2]: cost2[i-1];
        }
        
        
        return cost1[cost.length-1]<cost2[cost.length-1]?cost1[cost.length-1]:cost2[cost.length-1];
    }
    
    public static void main(String[] args) {
    	int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
		System.out.println(minCostClimbingStairs(cost));
	}
}
