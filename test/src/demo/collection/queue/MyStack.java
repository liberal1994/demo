package demo.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyStack<E> {
    private Deque<E> stack = new ArrayDeque<>();
    private int cap;

    public MyStack(int capacity) {
        cap = capacity;
    }

    public MyStack() {
        this(10);
    }

    public int getSize() {
        return stack.size();
    }

    public boolean push(E e) {
        if (stack.size() + 1 > cap) return false;
        return stack.offerLast(e);
    }

    public E pop() {
        return stack.pollLast();
    }

    public E peak() {
        return stack.peekLast();
    }

}
