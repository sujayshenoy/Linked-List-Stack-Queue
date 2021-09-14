package com.yml.linkedmain;

import java.io.PrintWriter;

import com.yml.linkedlist.LinkedList;

public class LinkedMain {
    public static void main(String args[]) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        linkedList.print();

        linkedList.insertAfter(30, 40);

        linkedList.print();
    }

}
