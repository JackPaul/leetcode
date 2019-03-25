package easy;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {
	
	private Queue<Integer> queue = null;
	private Queue<Integer> queueMirror = null;
    /** Initialize your data structure here. */
    public MyStack() {
    	queue = new LinkedList<>();
    	queueMirror = new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
    	
    	queueMirrorCopy(queue, queueMirror);
    	queueMirror.offer(x);
    	queueMirrorCopy(queueMirror, queue);
    }
    
    public static void queueMirrorCopy(Queue<Integer> queue, Queue<Integer> queueMirror) {
		// TODO Auto-generated method stub
		while(!queue.isEmpty()) {
			int num = queue.poll();
			queueMirrorCopy(queue, queueMirror);
			queueMirror.offer(num);
		}
	}

	/** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.poll();
    }
    
    /** Get the top element. */
    public int top() {
        return queue.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}

public class P225 {
    public static void queueMirrorCopy(Queue<Integer> queue, Queue<Integer> queueMirror) {
		// TODO Auto-generated method stub
		while(!queue.isEmpty()) {
			int num = queue.poll();
			queueMirrorCopy(queue, queueMirror);
			queueMirror.offer(num);
		}
	}
	public static void main(String[] args) {
		MyStack stack = new MyStack();

		stack.push(1);
		stack.push(2); 
		stack.push(3);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.empty());
		


	}
}
