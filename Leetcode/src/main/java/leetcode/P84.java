package leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class P84 {

    /*
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


    public static int largestRectangleArea(int[] heights) {
        int result = 0;
        for (int i = 0; i < heights.length; i++) {
            if (i < heights.length - 1 && heights[i+1] >= heights[i]) {
                continue;
            }
            int minH = heights[i];
            for(int j = i; j >= 0; j--) {
                minH = Math.min(minH, heights[j]);
                int c = minH * (i - j + 1);
                if(c > result) {
                    result = c;
                }
            }
        }
        return result;
    }
    */

    //单调栈解法
    public static int largestRectangleArea(int[] heights) {
        int result = 0;
        LinkedList<Integer> stack = new LinkedList<>();
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[stack.getFirst()] >= heights[i]) {
                int top = stack.pop();
                int minH = heights[top];
                result = Math.max(result, (i - top + 1) * minH);
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int top = stack.pop();
            int minH = heights[top];
            result = Math.max(result, (heights.length - top) * minH);
        }
        return result;
    }

//    public static int largestRectangleArea1(int[] heights) {
//        if (heights == null || heights.length < 1) return 0;
//        //构建一个栈低到栈顶 由小到大的单调栈
//        Stack<Integer> stack = new Stack<>();
//        int maxArea = 0;
//        for(int i = 0; i < heights.length; i++){
//            //栈不为空，并且栈顶的元素大于当前的元素时候，弹出栈中的元素
//            while (!stack.isEmpty() && heights[i] <= heights[stack.peek()]){
//                int j = stack.pop();
//                int k = stack.isEmpty()? -1 : stack.peek();
//                int curArea = (i - k - 1) * heights[j];
//                maxArea = Math.max(maxArea,curArea);
//            }
//            stack.push(i);
//        }
//        //当遍历完整个数组，栈不为空，那么需要继续弹出，说明没有比栈顶元素更小的元素了
//        while (!stack.isEmpty()){
//            int j = stack.pop();
//            int k = stack.isEmpty() ? -1 : stack.peek();
//            int curArea = (heights.length - k - 1) * heights[j];
//            maxArea = Math.max(maxArea,curArea);
//        }
//        return maxArea;
//    }
    public static void main(String[] args) {
		int[] heights = {4,2,0,3,2,5};
		//2,1,5,6,2,3
		//2,1,5,6,2,3
        //4,2,0,3,2,5
		LinkedList<Integer> li = new LinkedList<>();
		li.push(4);
		li.push(3);
		li.push(2);
		li.push(1);
        System.out.println(li.pop());
		System.out.println(largestRectangleArea(heights));
	}
}
