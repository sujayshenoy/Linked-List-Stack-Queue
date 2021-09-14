package com.yml.linkedlist;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<Node<T>> {
    Node<T> head;
    
    public LinkedList() {
        head = null;
    }

    public void add(T data) {
        Node<T> newNode = new Node<T>(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.setNext(head);
        head = newNode;
    }

    public void print() {
        Iterator<Node<T>> itr = this.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next().getData() + "->");
        }
        System.out.println();
    }

    @Override
    public Iterator<Node<T>> iterator() {
        return new LinkedListIterator<T>(head);
    }
}

