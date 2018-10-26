package medium;

import java.util.ArrayList;
import java.util.List;

public class P89 {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        int m = 1;
        for(int i = 1; i <= n; i++) {
        	d.add(m);
        	d.add(0 - m);
        	m *= 2;
        }
        grayCodeHelper(n, res, d, 0);
        return res;
    }

	private void grayCodeHelper(int n, List<Integer> res, List<Integer> d, int last) {
		if(res.size() == (int)Math.pow(2, n))
			return;
		else {
			res.add(last);
			boolean flag = true;
			for(int i = 0; i < d.size(); i++) {
				int diff = d.get(i);
				int a = res.get(res.size() - 1) + diff;
				if(a > 0 && a <= n) {
					flag = false;
						if(res.indexOf(a) == -1) {	
						grayCodeHelper(n, res, d, a);	
					}
				}
			}
			if(flag)
				res.remove(res.size()-1);
		}	
	}
}
