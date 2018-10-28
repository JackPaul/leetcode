package medium;

import java.util.ArrayList;
import java.util.List;

public class P93 {

    public List<String> restoreIpAddresses(String s) {
    	List<String> res = new ArrayList<>();
    	if(s.length() == 12) {
    		String a = s.substring(0, 3) + "." + s.substring(3, 6)+s.substring(6, 9) + "." + s.substring(9, 12);
    		res.add(a);
    	} else {
    		
    	}
    	return res;
    }

}
