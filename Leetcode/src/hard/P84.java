package hard;

import java.util.LinkedList;

public class P84 {

    public static int largestRectangleArea(int[] heights) {
        if(heights.length < 1)
            return 0;
        if(heights.length == 1)
            return heights[0];
        int max = 0;
        LinkedList<Integer> stack = new LinkedList<Integer>();
        int i = 0;
        for(i = 0; i < heights.length; i++){
            if(stack.isEmpty()){
                stack.push(i);
            }
            if(heights[i] > heights[stack.peek()]) {
                stack.push(i);
            } else {
                while(!stack.isEmpty() && heights[stack.peek()] > heights[i]) {
                    int j = stack.pop();
                    int area = (i-j)*heights[j];
                    max = max>=area?max:area;
                }
                stack.push(i);
            }
        }
        while(!stack.isEmpty()) {
        	max = max>=(i-stack.peek()) * heights[stack.peek()]?max:(i-stack.peek()) * heights[stack.peek()];
        	stack.pop();
        }
        return max;
    }
    public static void main(String[] args) {
		int[] heights = {0,0};
		System.out.println(largestRectangleArea(heights));
	}
}
