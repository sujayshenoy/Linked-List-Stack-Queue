package com.yml.linkedmain;

import java.io.PrintWriter;

import com.yml.linkedlist.LinkedList;

public class LinkedMain {
    public static void main(String args[]) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(56);
        linkedList.add(30);
        linkedList.add(70);

        linkedList.print();
    }

}
