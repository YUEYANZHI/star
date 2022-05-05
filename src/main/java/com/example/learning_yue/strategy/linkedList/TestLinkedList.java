package com.design.pattern.strategy.linkedList;

/**
 * @author Yue YanZhi
 * @description TODO
 * @date 2022-04-25 10:01
 */
public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(3,0);
        linkedList.insert(7,1);
        linkedList.insert(9,2);
        linkedList.insert(5,3);

        linkedList.remove(0);
        linkedList.output();
    }
}
