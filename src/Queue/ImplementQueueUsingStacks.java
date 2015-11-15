package Queue;

import java.util.Stack;


//http://www.geeksforgeeks.org/queue-using-stacks/
public class ImplementQueueUsingStacks {
	private Stack<Integer> inbox = new Stack<Integer>();
    private Stack<Integer> outbox = new Stack<Integer>();
    
    // Push element x to the back of queue.
    public void push(int x) {
        inbox.push(x);
        
    }

    // Removes the element from in front of queue.
    public void pop() {
        if(this.empty())
            return;
        
        if(outbox.isEmpty()){
            while(!inbox.isEmpty()){
                outbox.push(inbox.pop());
            }
        }
        outbox.pop();
    }

    // Get the front element.
    public int peek() {
        if(this.empty())
            throw new RuntimeException("Queue is empty");
        
        if(outbox.isEmpty()){
            while(!inbox.isEmpty()){
                outbox.push(inbox.pop());
            }
        }
        return outbox.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return outbox.isEmpty() && inbox.isEmpty();
    }
}
