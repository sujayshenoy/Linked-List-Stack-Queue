package com.yml.linkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<T extends Comparable<T>> implements Iterable<Node<T>> {
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
        size++;
    }

    public void insertAfter(T element, T data) throws NoSuchElementException {
        int position = search(element);
        if (position < 0) {
            throw new NoSuchElementException();
        }
        insertAt(position + 1, data);
    }
    
    public void insertBefore(T element, T data) throws NoSuchElementException {
        int position = search(element);
        if (position < 0) {
            throw new NoSuchElementException();
        }
        insertAt(position, data);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public T pop() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        Node<T> temp = head;
        head = head.getNext();
        size--;
        return temp.getData();

    }
    
    public T popLast() throws NoSuchElementException {
        T popped = null;
        Node<T> temp = head;

        if (isEmpty()) {
            throw new NoSuchElementException();
        } else if (head.getNext() == null) {
            popped = temp.getData();
            head = null;
        } else {
            while (temp.getNext().getNext() != null) {
                temp = temp.getNext();
            }
            popped = temp.getNext().getData();
            temp.setNext(null);
        }
        size--;
        return popped;
    }
    
    public T remove(int index) throws NoSuchElementException, IndexOutOfBoundsException {
        T removed = null;
        Node<T> temp = head;
        Node<T> prev = temp;

        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (index > size()) {
            throw new IndexOutOfBoundsException();
        }

        int count = 0;
        while (count != index) {
            prev = temp;
            temp = temp.getNext();
            count++;
        }
        prev.setNext(temp.getNext());
        removed = temp.getData();
        temp = null;
        
        size--;
        return removed;
    }
    
    public T findAndRemove(T element) throws NoSuchElementException {
        int position = search(element);
        if (position < 0) {
            throw new NoSuchElementException();
        }
        return remove(position);
    }

    public int search(T data) throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        Node<T> temp = head;
        int count = 0;
        do{
            if (temp.getData() == data) {
                return count;
            }
            temp = temp.getNext();
            count++;
        } while (temp != null);

        return -1;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked list is empty");
        }

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

