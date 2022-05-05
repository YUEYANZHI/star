package com.design.pattern.strategy.array;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[]{3,1,2,5,4,9,7,2};
        MyArray arr = new MyArray(10);
        arr.insert(3,0);
        arr.insert(7,1);
        arr.insert(9,2);
        arr.insert(5,3);
        arr.insert(5,0);
        arr.insert(6,1);
        arr.output();

    }
}
