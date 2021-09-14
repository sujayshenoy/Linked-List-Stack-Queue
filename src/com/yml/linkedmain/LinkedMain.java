package com.yml.linkedmain;

import java.io.PrintWriter;

import com.yml.linkedlist.LinkedList;
import com.yml.linkedlist.OrderedLinkedList;
import com.yml.stack.Stack;

public class LinkedMain {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.print();

        while (!stack.isEmpty()) {
            System.out.println("Peek : " + stack.peek());
            System.out.println("Popped : " + stack.pop());
            stack.print();
        }        
    }

}
