package com.yml.linkedmain;

import java.io.PrintWriter;

import com.yml.linkedlist.LinkedList;
import com.yml.linkedlist.OrderedLinkedList;
import com.yml.queue.Queue;
import com.yml.stack.Stack;

public class LinkedMain {
    public static void main(String args[]) {
        Queue<Integer> queue = new Queue<Integer>();

        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        queue.print();

    }

}
