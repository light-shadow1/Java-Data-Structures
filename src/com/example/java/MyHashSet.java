package com.example.java;

/**
 * Created by tanujain on 8/27/2018.
 */
class listNode {
    int val;
    listNode next;
    listNode(int val){
        this.val = val;
        this.next = null;
    }
}

class MyHashSet {



    /** Initialize your data structure here. */
    listNode[] buckets;


    public int hashFunc(int key) {
        return key%500;
    }

    public MyHashSet() {
        buckets = new listNode[500];
    }

    public void add(int key) {
        int bucketNum = hashFunc(key);
        listNode prev = buckets[bucketNum];
        listNode runner = buckets[bucketNum];
        while(runner != null ) {
            if(runner.val != key) {
                prev = runner;
                runner = runner.next;
            } else {
                return;
            }
        }
        listNode keyObj = new listNode(key);
        if(prev == null) {
            buckets[bucketNum] = keyObj;
        }
        else prev.next = keyObj;



    }

    public void remove(int key) {
        int bucketNum = hashFunc(key);
        listNode runner = buckets[bucketNum];
        listNode prev = buckets[bucketNum];
        while(runner != null ) {
            if(runner.val != key) {
                prev = runner;
                runner = runner.next;
            } else {
                if (runner.next == null  ) {
                    if (prev.next == null)
                        buckets[bucketNum] = null;
                }

                prev.next = runner.next;
                break;
            }
        }
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int bucketNum = hashFunc(key);
        listNode runner = buckets[bucketNum];
        while(runner != null ) {
            if(runner.val != key) {
                runner = runner.next;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        MyHashSet obj = new MyHashSet();
        obj.add(1);
        obj.add(2);
        System.out.println(obj.contains(1));
        System.out.println(obj.contains(3));
        obj.add(2);
        System.out.println(obj.contains(2));
        obj.remove(2);
        System.out.println(obj.contains(2));


    }

}



/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */