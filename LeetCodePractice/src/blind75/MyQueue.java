package blind75;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyQueue {

    @Override
    public String toString() {
        return "MyQueue{" +
                "s1=" + s1 +
                ", s2=" + s2 +
                '}';
    }

    private Deque<Integer> s1;
    private Deque<Integer> s2;

    public MyQueue() {
        this.s1 = new ArrayDeque<>();
        this.s2 = new ArrayDeque<>();
    }

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        moveIfEmpty();

        return s2.pop();
    }

    public int peek() {
        moveIfEmpty();

        return s2.peek();
    }

    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    private void moveIfEmpty() {
        if(!s2.isEmpty()) return;

        while(!s1.isEmpty()) {
            s2.push(s1.pop());
        }
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();

        myQueue.push(3);
        myQueue.push(4);
        myQueue.push(0);
        myQueue.push(1);
        myQueue.push(5);

        System.out.println(myQueue);
        System.out.println(myQueue.pop());
        System.out.println(myQueue.peek());
        System.out.println(myQueue.empty());

    }
}
