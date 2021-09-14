package com.yml.queue;

import com.yml.linkedlist.LinkedList;

public class Queue<T extends Comparable<T>> extends LinkedList<T> {
    
    public void enqueue(T data) {
        append(data);
    }
}
