package blind75;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

    @Override
    public String toString() {
        return queue.toString();
    }

    private Queue<Integer> queue;
    public MyStack() {
        this.queue = new LinkedList<>();
    }

    public void push(int x) {
        this.queue.add(x);
        this.rotate();
    }

    public int pop() {
        return this.queue.poll();
    }

    public int top() {
        return this.queue.peek();
    }

    public boolean isEmpty() {
        return this.queue.isEmpty();
    }

    public void rotate() {
        int n = queue.size();
        while(n-1 != 0) {
            queue.add(queue.poll());
            n--;
        }
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        myStack.push(3);
        myStack.push(4);
        myStack.push(0);
        myStack.push(1);
        myStack.push(5);
        System.out.println(myStack);
        System.out.println(myStack.pop());
        System.out.println(myStack.top());
        System.out.println(myStack.isEmpty());
    }
}
