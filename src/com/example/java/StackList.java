package com.example.java;

/**
 * Created by tanujain on 8/16/2018.
 */
public class StackList {

        private linkNode head = null;


        public void push(int data) {
            linkNode current = new linkNode(data);
            current.next = this.head;
            this.head = current;
        }
        public boolean isEmpty(){
            return head == null;
        }

        public int pop() {
            if(isEmpty()) return 0;
            else {
                int elem = head.data;
                head = head.next;
                return elem;
            }

        }

        public static void main(String[] args) {
            System.out.println("Hello, World!");

            StackList obj = new StackList();
            obj.push(5);
            obj.push(3);
            obj.push(10);
            System.out.print(obj.pop());
        }



    }


