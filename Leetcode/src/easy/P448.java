package easy;

import java.util.ArrayList;
import java.util.List;

public class P448 {

	public static List<Integer> findDisappearedNumbers(int[] nums) {
		//too slow
//        List<Integer> res = new ArrayList<>(); 
//        for(int i = 1; i <= nums.length; i++) {
//        	res.add(i);
//        }
//        
//        for(int i = 0; i <= nums.length - 1; i++) {
//        	//res.remove(nums[i]);
//        	int j = res.indexOf(nums[i]);
//        	if(j != -1)
//        		res.remove(j);
//        }
		List<Integer> res = new ArrayList<>(); 
		int j = 0;
		int c = 0;
		for(int i = 0; i <= nums.length - 1; i++) {
			if(nums[i] != 0) {
				j = nums[i] - 1;
				while(nums[j] != 0) {
					c = nums[j];
					nums[j] = 0;
					j = c - 1;
				}
			}
			
		}

        for(int i = 0; i <= nums.length - 1; i++) {
        	if(nums[i] != 0)
        		res.add(i+1);
        }
        return res;
    }

	public static void main(String[] args) {
		int[] a = {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers(a));
	}
}
