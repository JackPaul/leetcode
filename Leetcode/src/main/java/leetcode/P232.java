package easy;

import java.util.LinkedList;

class MyQueue {
	private LinkedList<Integer> stack = null;
	private LinkedList<Integer> stackMirror = null;
    /** Initialize your data structure here. */
    public MyQueue() {
        stack = new LinkedList<>();
        stackMirror = new LinkedList<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
    	stackMirror.clear();
    	int num;
    	while(!stack.isEmpty()) {
    		num = stack.pop();
    		stackMirror.push(num);
    	}
    	stackMirror.push(x);
    	
    	while(!stackMirror.isEmpty()) {
    		num = stackMirror.pop();
    		stack.push(num);
    	}
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return stack.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        return stack.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.isEmpty();
    }
}

public class P232 {
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();

		queue.push(1);
		queue.push(2);  
		System.out.println(queue.peek()); // returns 1
		System.out.println(queue.pop());   // returns 1
		System.out.println(queue.empty()); // returns false
	}
}
