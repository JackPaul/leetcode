package easy;

public class P645 {
    public int[] findErrorNums(int[] nums) {  	
    	int[] res = new int[2];
        int[] map = new int[nums.length + 1];
        for(int i = 0; i < nums.length; i++)
        	map[nums[i]] ++;
        
        for(int i = 1; i <= nums.length; i++) {
        	if(map[i] == 2)
        		res[0] = i;
        	if(map[i] == 0)
        		res[i] = i;
        }
        
        return res;
    }
}
