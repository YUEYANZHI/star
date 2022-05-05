package com.design.pattern.strategy.linkedList;


/**
 * @author Yue YanZhi
 * @description TODO
 * @date 2022-04-25 09:09
 */
public class LinkedList {

    //链表头节点
    private Node head;
    //链表尾节点
    private Node last;
    //链表长度
    private int size;

    /**
     * @param data  插入索引
     * @param index 插入位置
     */
    public void insert(int data, int index) {
        if (size < 0 || index > size) {
            throw new IndexOutOfBoundsException("超出链表节点范围!!!");
        }
        Node insertNode = new Node(data);
        if (size == 0) {
            //空链表
            head = insertNode;
            last = insertNode;
            //插入头部
        } else if (index == 0) {
            insertNode.next = head;
            head = insertNode;
            //插入尾部
        } else if (size == index) {
            last.next = insertNode;
            last = insertNode;
            //插入中间
        } else {
            Node prevNode = get(index - 1);
            insertNode.next = prevNode.next;
            prevNode.next = insertNode;
        }
        size++;
    }

    /**
     * 链表删除元素
     */
    public Node remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("超出链表存储节点空间");
        }
        Node removeNode = null;
        if (index == 0) {
            //删除头部节点
            removeNode = head;
            head = head.next;
        } else if (index == size - 1) {
            //删除尾部节点
            Node prevNode = get(index - 1);
            removeNode = prevNode.next;
            prevNode.next = null;
            last = prevNode;
        } else {
            //删出中间节点
            Node prevNode = get(index - 1);
            Node nextNode = prevNode.next.next;
            removeNode = prevNode.next;
            prevNode.next = nextNode;
        }
        size--;
        return removeNode;
    }

    /**
     * 链表查找元素
     *
     * @param index
     * @return
     */
    public Node get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("超出元素节点查找范围");
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    /**
     * 输出链表
     */
    public void output() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    /**
     * 链表节点
     */
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
}
