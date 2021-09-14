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
        System.out.println("List size : "+linkedList.size());
        linkedList.insertAfter(30, 40);
        linkedList.print();
        System.out.println("List size : "+linkedList.size());
        linkedList.findAndRemove(40);
        linkedList.print();
        System.out.println("List size : "+linkedList.size());
    }

}
