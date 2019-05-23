package leetcode;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @author jackpaul <jiekepao@gmail.com>
 * Created on 2019-04-18 21:52
 * @Description:
 */
public class P279 {
    public int numSquares(int n) {
        List<Integer> list = new ArrayList<>();
        int i = 1;
        while(i * i <= n) {
            list.add(i * i);
            i++;
        }
        int res = n;
        int idx = list.size();
        while (idx >= 0) {
            int k = n;
            int count = counts(list, k, 0, idx, 0);
            idx--;
            res = res > count?count:res;
        }
        return 0;
    }

    private int counts(List<Integer> list, int k, int i, int idx, int count) {
        if(k == 0) {
            return count;
        }

        return 0;
    }
}
