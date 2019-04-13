package demos;

/**
 * @author jackpaul <jiekepao@gmail.com>
 * Created on 2019-04-05 21:12
 * @Description:
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();

            }
            int j = n - 1;
            while(j > 0) {
                if(nums[j - 1] > nums[j]) {
                    break;
                } else {
                    j--;
                }
            }
            System.out.println(j);
        }
    }
}
