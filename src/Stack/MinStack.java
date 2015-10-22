package Stack;

import java.util.Stack;

class MinStack {
    private static Stack<Integer> stack = new Stack<Integer>();
    private static Stack<Integer> minimumElements = new Stack<Integer>();
    
    public void push(int x) {
        stack.push(x);
        if(minimumElements.isEmpty() || x < minimumElements.peek())
            minimumElements.push(x);
    }

    public void pop() {
        int valueOnTop = stack.pop();
        if(minimumElements.peek() == valueOnTop)
            minimumElements.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minimumElements.peek();
    }
    
    public static void main(String[] args) {
    	MinStack ms = new MinStack();
    	ms.push(-3);
    	ms.push(-1);
    	System.out.println(ms.top());
    	System.out.println(ms.getMin());
	}
}
