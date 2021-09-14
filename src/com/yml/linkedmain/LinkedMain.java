package com.yml.linkedmain;

import java.io.PrintWriter;

import com.yml.linkedlist.LinkedList;
import com.yml.linkedlist.OrderedLinkedList;

public class LinkedMain {
    public static void main(String args[]) {
        OrderedLinkedList<Integer> orderedLinkedList = new OrderedLinkedList<Integer>();

        orderedLinkedList.add(56);
        orderedLinkedList.add(30);
        orderedLinkedList.add(40);
        orderedLinkedList.add(70);
        orderedLinkedList.print();
        System.out.println("List size : "+orderedLinkedList.size());
    }

}
