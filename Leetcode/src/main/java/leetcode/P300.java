package leetcode;

/**
 * @author jackpaul <jiekepao@gmail.com>
 * Created on 2019-04-17 22:33
 * @Description:
 */
public class P300 {
    public static int lengthOfLIS(int[] nums) {
        if(nums.length <= 1) {
            return nums.length;
        }
        int[] biggerNumsAfter = new int[nums.length];
        int res = 0;
        for(int i = nums.length - 2; i >= 0; i--) {
            int j = i + 1;
            int currentMax = 0;
            while (j < nums.length) {
                if( nums[j] > nums[i]){
                    currentMax = currentMax>=biggerNumsAfter[j]+1?currentMax:biggerNumsAfter[j]+1;
                }
                j++;
            }
            biggerNumsAfter[i] = currentMax;
            res = res>=biggerNumsAfter[i]?res:biggerNumsAfter[i];
        }
        return res + 1;
    }

    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums));
        System.out.println();
    }
}
