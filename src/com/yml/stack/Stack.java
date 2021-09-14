package com.yml.stack;

import com.yml.linkedlist.LinkedList;

public class Stack<T extends Comparable<T>> extends LinkedList<T> {

    public void push(T data) {
        add(data);
    }

    public T getTop() {
        return getHead().getData();
    }

}
