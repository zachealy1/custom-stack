package stacks;

import java.util.EmptyStackException;

public class StackTwo<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private E[] stack;
    private int top;

    public StackTwo() {
        stack = (E[]) new Object[DEFAULT_CAPACITY];
        top = -1;
    }

    public void push(E element) {
        if (top == stack.length - 1) {
            expandCapacity();
        }
        stack[++top] = element;
    }

    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        E element = stack[top];
        stack[top--] = null; // Clear the reference to support garbage collection
        return element;
    }

    public E top() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    private void expandCapacity() {
        int newCapacity = stack.length * 2;
        E[] newStack = (E[]) new Object[newCapacity];
        System.arraycopy(stack, 0, newStack, 0, stack.length);
        stack = newStack;
    }
}