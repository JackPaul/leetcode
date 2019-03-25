package hard;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentHashMap;

public class P295 {

	static class MedianFinder {
		private int count = 0;
		private PriorityQueue<Integer> right = new PriorityQueue<>();
		private PriorityQueue<Integer> left = new PriorityQueue<Integer>(15, new Comparator<Integer>() {
		    @Override
		    public int compare(Integer o1, Integer o2) {
		        return o2 - o1;
		    }
		});

		//读入字符，放到合适位置 
		public void addNum(Integer num) {
		    if ((left.size() + right.size()) %2 == 0) {
		        left.offer(num);
		        int filteredMaxNum = left.poll();
		        right.offer(filteredMaxNum);
		    } else {
		        right.offer(num);
		        int filteredMinNum = right.poll();
		        left.offer(filteredMinNum);
		    }
		    count++;
		}

		//求中位数
		public Double findMedian() {
		    if ((left.size() + right.size()) %2 == 0) {
		        return new Double((right.peek() + left.peek())) / 2;
		    } else {
		        return new Double(right.peek());
		    }
		}

	}
	
	public static void main(String[] args) {
//		 MedianFinder obj = new MedianFinder();
//		 obj.addNum(1);
//		 obj.addNum(2);
//		 double param_2 = obj.findMedian();
//		 System.out.println(param_2);
		String a = "haha";
		String b = "haha";
		String c = new String("haha");
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
	}


}
