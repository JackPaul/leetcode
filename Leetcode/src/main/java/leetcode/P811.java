package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//["900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"]
//Output: 
//["901 mail.com","50 yahoo.com","900 google.mail.com","5 wiki.org","5 org","1 intel.mail.com","951 com"]
public class P811 {

	public static List<String> subdomainVisits(String[] cpdomains) {
        
		List<String> list = new ArrayList<String>();
		Map<String, Integer> map = new HashMap<>();
		for(String s : cpdomains) {
			String[] elements = s.split(" ");
			int count = Integer.parseInt(elements[0]);
			String[] ip = elements[1].split("\\.");
			//System.out.println(ip[0]);
			String topLevel = ip[ip.length-1];
			if(map.containsKey(topLevel)) {
				map.put(topLevel, map.get(topLevel)+count);
			} else{
				map.put(topLevel, count);
			}
			
			for(int i = ip.length-2; i >= 0 ; i--) {
				topLevel = ip[i]+"."+topLevel;
				if(map.containsKey(topLevel)) {
					map.put(topLevel, map.get(topLevel)+count);
				} else{
					map.put(topLevel, count);
				}
			}
		}
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			list.add(entry.getValue()+" "+entry.getKey());
		}
		return list;
    }
	
	public static void main(String[] args) {
		String[] a = {"9001 discuss.leetcode.com"};
		System.out.println(subdomainVisits(a));
	}
}
