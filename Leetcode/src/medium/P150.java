package medium;

import java.util.LinkedList;

public class P150 {
    public int evalRPN(String[] tokens) {     
        LinkedList<Integer> nums = new LinkedList<>();
        int num1 = 0, num2;
        for(String t : tokens) {
        	if(!(t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/"))) {
        		nums.push(Integer.parseInt(t));
        	} else {
				num1 = nums.pop();
				num2 = nums.pop();
        		switch (t) {
				case "+":
					nums.push(num2 + num1);
					break;
				case "-":
					nums.push(num2 - num1);
					break;
				case "*":
					nums.push(num2 * num1);
					break;
				case "/":
					nums.push(num2 / num1);
					break;
				default:
					break;
				}
        	}
        }
        return nums.pop();
    }
}
