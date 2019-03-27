package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P728 {

	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> list = new ArrayList<>();
		int digit = 0;
		int number = 0;
		boolean flag=true;
		for(int i = left; i <= right; i++) {
			number = i;
			flag=true;
			while(number > 0) {
				digit = number % 10;
				if(digit == 0) {
					flag=false;
					break;
				} else if(i % digit != 0) {
					flag=false;
					break;
				} else {
					number /= 10;
				}
			}
			if(flag) {
				list.add(i);
			}
		}
		return list;
    }

}
