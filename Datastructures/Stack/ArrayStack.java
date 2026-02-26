package Datastructures.Stack;

import java.util.ArrayList;
import java.util.EmptyStackException;

/*
A simple Java Stack implementation which just wraps the built in ArrayList
 */
public class ArrayStack<E> implements Stack<E> {
    protected ArrayList<E> arr = new ArrayList<E>();

    @Override
    public void push(E element) {
        arr.add(element);
    }

    @Override
    public E pop() throws EmptyStackException {
        if (arr.size() <= 0) {
            throw new EmptyStackException();
        }
        return arr.removeLast();
    }

    @Override
    public E top() throws EmptyStackException {
        if (arr.size() <= 0) {
            throw new EmptyStackException();
        }
        return arr.getLast();
    }

    @Override
    public int size() {
        return arr.size();
    }

    @Override
    public boolean isEmpty() {
        return arr.isEmpty();
    }
}
