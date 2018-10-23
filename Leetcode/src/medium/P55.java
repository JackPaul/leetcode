package medium;

import java.util.ArrayList;
import java.util.List;

public class P55 {
    public boolean canJump(int[] nums) {
        List<Integer> p = new ArrayList<>();
        for(int i = 0; i < nums.length - 1; i++) {
        	int steps = nums[i];
        	for(int j = 1; j <= steps; j++) {
        		if(j + i)
        		p.add(j+i);
        	}
        }
    }
}
