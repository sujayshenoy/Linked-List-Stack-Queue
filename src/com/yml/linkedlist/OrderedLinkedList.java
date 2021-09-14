package com.yml.linkedlist;

import java.util.Iterator;

public class OrderedLinkedList<T extends Comparable<T>> extends LinkedList<T>{
    
    @Override
    public void add(T data) {
        Node<T> newNode = new Node<T>(data);

        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        
        if (head.getNext() == null) {
            if (head.compareTo(newNode) > 0) {
                newNode.setNext(head);
                head = newNode;
            } else {
                head.setNext(newNode);
            }
            size++;
            return;
        }
        
        Iterator<Node<T>> itr = this.iterator();
        Node<T> current = itr.next();
        while (current.getNext() != null) {
            if (newNode.compareTo(current) < 0) {
                insertBefore(current.getData(), data);
                return;
            }
            current = itr.next();
        }

        if (newNode.compareTo(current) > 0) {
            insertAfter(current.getData(), data);
        }
        else {
            insertBefore(current.getData(), data);
        }
    }
}
