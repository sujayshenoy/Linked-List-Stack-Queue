package com.yml.linkedlist;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<Node<T>> {
    Node<T> head;
    int size;
    
    public LinkedList() {
        head = null;
        size = 0;
    }

    public void add(T data) {
        Node<T> newNode = new Node<T>(data);

        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        newNode.setNext(head);
        head = newNode;
        size++;
    }

    public void append(T data) {
        Node<T> newNode = new Node<T>(data);

        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        Node<T> temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(newNode);
        size++;
    }
    
    public void insertAt(int pos, T data) throws IndexOutOfBoundsException {
        Node<T> temp = head;
        Node<T> newNode = new Node<T>(data);

        if (pos > size || pos < 0) {
            throw new IndexOutOfBoundsException();
        }

        int count = 0;
        while (count < pos - 1) {
            temp = temp.getNext();
            count++;
        }
        newNode.setNext(temp.getNext());
        temp.setNext(newNode);
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

