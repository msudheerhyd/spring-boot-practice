package blind75;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinStack {

    @Override
    public String toString() {
        return stack1.toString();
    }

    private Deque<Integer> stack1;
    private Deque<Integer> stack2;

    public MinStack() {
        stack1 = new ArrayDeque<>();
        stack2 = new ArrayDeque<>();
    }

    public void push(int val) {
        if(stack2.isEmpty() || stack2.peek() >= val) {
            stack2.push(val);
        }
        stack1.push(val);
    }
    public int pop() {
        int x = stack1.pop();
        if(x == stack2.peek()) {
            stack2.pop();
        }
        return x;
    }

    public int top() {
        return stack1.peek();
    }
    public int getMin() {
        return stack2.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(3);
        minStack.push(5);
        minStack.push(0);
        minStack.push(4);
        minStack.push(1);

        System.out.println(minStack);

//        minStack.getMin();

        System.out.println(minStack.getMin());

        System.out.println(minStack.pop());

        System.out.println(minStack.top());

        System.out.println(minStack.getMin());

    }
}
