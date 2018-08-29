package easy;

import java.util.ArrayList;
import java.util.List;

public class P119 {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        if(rowIndex == 1) {
        	res.add(1);
        	return res;
        } else if(rowIndex == 2) {
        	res.add(1);res.add(1);
        	return res;
        } else {
        	res.add(1);res.add(1);
        	for(int j = 2; j <= rowIndex; j++) {
	        	for(int i = 0; i < res.size() - 1; i++) {
	        		current.add(res.get(i)+res.get(i+1));
	        	}
	        	current.add(1);
	        	current.add(0, 1);
	        	res.clear();
	        	res.addAll(current);
	        	current.clear();
        	}
        	return res;
        }
        	
    }

}
