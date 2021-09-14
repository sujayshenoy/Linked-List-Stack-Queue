package com.yml.linkedmain;

import java.io.PrintWriter;

import com.yml.linkedlist.LinkedList;

public class LinkedMain {
    public static void main(String args[]) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.append(56);
        linkedList.append(70);
        linkedList.insertAt(1, 30);
        linkedList.print();
        
        System.out.println("Popped : "+linkedList.popLast());

        linkedList.print();
    }

}
