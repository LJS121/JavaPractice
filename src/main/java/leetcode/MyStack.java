package leetcode;

import java.util.ArrayDeque;

/**
 * @author jinsong.Liang
 * @date 2019/4/1 18:20
 */
class MyStack {

    ArrayDeque<Integer> queue;

    /**
     * Initialize your data structure here.
     */
    public MyStack() {
        queue = new ArrayDeque();
    }

    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque();
        ad.add(0);
        ad.add(10);
        ad.add(100);
        System.out.println(ad.peek());
        System.out.println(ad.peekLast());
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        queue.add(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        return queue.pollLast();
    }

    /**
     * Get the top element.
     */
    public int top() {
        return queue.peek();
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return queue.isEmpty();
    }
}