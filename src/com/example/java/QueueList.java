package com.example.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tanujain on 8/15/2018.
 */

class linkNode {
    int data;
    linkNode next = null;
    linkNode(int data) {
        this.data = data;
    }
}

public class QueueList {
    private linkNode head = null;
    private linkNode tail = null;

    public void enqueue(int data) {
        linkNode current = new linkNode(data);
        if(head == null) {
            tail = current;
            head = current;
        } else {
            head.next = current;
            this.head = current;

        }


    }
    public boolean isEmpty(){
        return tail == null;
    }

    public int dequeue() {
        if(isEmpty()) return 0;
        else {
            int elem = tail.data;
            tail = tail.next;
            return elem;
        }

    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        QueueList obj = new QueueList();
        obj.enqueue(5);
        obj.enqueue(3);
        obj.enqueue(10);
        System.out.println(obj.dequeue());
        System.out.println(obj.dequeue());
        System.out.println(obj.dequeue());
        System.out.println(obj.dequeue());
    }



}


