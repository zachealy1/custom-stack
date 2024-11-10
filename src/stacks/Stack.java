package stacks;

import java.util.ArrayList;
import java.util.List;

public class Stack<E> {
    private final List<E> stack;

    public Stack() {
        stack = new ArrayList<>();
    }

    public void push(E element) {
        stack.add(element);
    }

    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot pop from an empty stack.");
        }
        return stack.remove(stack.size() - 1);
    }

    public E top() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot get top element from an empty stack.");
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
