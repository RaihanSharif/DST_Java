package Datastructures.Stack;

import java.util.EmptyStackException;

public interface Stack<E> {

    public void push(E element);

    public E pop() throws EmptyStackException;

    public E top() throws EmptyStackException;

    public int size();

    public boolean isEmpty();
    
}