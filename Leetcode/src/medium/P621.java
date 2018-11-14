package medium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P621 {
	public static int leastInterval(char[] tasks, int n) {
			if(n == 0)
				return tasks.length;
			
		Map<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < tasks.length; i++) {
			if(map.containsKey(tasks[i])) {
				map.put(tasks[i], map.get(tasks[i]) + 1);
			} else {
				map.put(tasks[i], 1);
			}
		}
		
		char[] cs = new char[(tasks.length - 1) * n + tasks.length];
		//降序排序
		List<Integer> nums = new ArrayList<>(map.values());
		Collections.sort(nums, new Comparator<Integer>() {
			public int compare(Integer num1, Integer num2) {
				return num2.intValue() - num1.intValue();
			}	
		});
		
		int res = 0;
		int start = 0;
		int cur = 0;
		for(Integer num : nums) {
			for(start = cur; start < cs.length && cs[start] == 'A'; start++)
				;
			for(int j = 0; j < num; j++) {
				int pos = j * (n + 1) + start;
				cs[pos] = 'A';
				res = res > pos?res:pos;
			}
			cur = start+1;
		}
		return res + 1;
	}
	
	public static void main(String[] args) {
		char[] tasks = {'A','A','B','B','B','B','C','C','C'};
		System.out.println(leastInterval(tasks, 1));

	}
}
