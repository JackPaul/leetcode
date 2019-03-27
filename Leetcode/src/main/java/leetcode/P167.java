package leetcode;

public class P167 {

    public static int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int index = 0;
        for(int i = 0; i < numbers.length-1 && numbers[i] <= target; i++) {
        	index = binarySearch(numbers, i + 1, numbers.length - 1, target - numbers[i]);
        	if(index != -1) {
        		res[0] = i + 1;
        		res[1] = index + 1;
        		return res;
        	}
        }
        return res;
    }

	public static int binarySearch(int[] numbers, int begin, int end, int target) {
		if((begin == end && numbers[begin] != target) || begin > end ) {
			return -1;
		}
		
		int center = (begin + end) / 2;
		if(numbers[center] == target)
			return center;
		else if(numbers[center] > target)
			return binarySearch(numbers, begin, center-1, target);
		else
			return binarySearch(numbers, center+1, end, target);
	}


	public static void main(String[] args) {
		int[] a = {-1, 0};
		twoSum(a, -1);
		//System.out.println( binarySearch(a, 1, 3, 7));
	}
}
