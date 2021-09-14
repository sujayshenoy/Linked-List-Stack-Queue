package com.yml.stack;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

import com.yml.linkedlist.LinkedList;

public class Stack<T extends Comparable<T>> extends LinkedList<T> {

    public void push(T data) {
        add(data);
    }

    public T getTop() {
        if (getHead() != null) {
            return getHead().getData();
        }
        return null;
    }

    public T peek() {
        return getTop();
    }

    public T pop() throws EmptyStackException {
        T popped = null;
        try {
            popped = super.pop();
        } catch (NoSuchElementException e) {
            throw new EmptyStackException();
        }
        return popped;
    }
}
