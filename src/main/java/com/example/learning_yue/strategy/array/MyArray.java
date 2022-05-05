package com.design.pattern.strategy.array;

public class MyArray {
    private int[] array;
    private int size;

    public MyArray(int capacity) {
        this.array = new int[capacity];
        size = 0;
    }

    /**
     * 数据插入元素
     *
     * @param element 插入的元素
     * @param index   插入的位置
     */
    public void insert(int element, int index) {
        //判断访问下标是否超出范围
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("超出数组下标范围");
        }
        //判断数组是否超出最大容量
        if (size> array.length){
            resize();
        }
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        //腾出的位置放入新元素
        array[index] = element;
        size++;
    }
    public int delete(int index){
        if (index <0 || index >= size){
            throw new IndexOutOfBoundsException("超出元素实际范围");
        }
        int deleteIndex = array[index];
        //从左像右循环 把元素依次像左挪动一位
        for (int i = index; i<size-1;i++){
            array[i]= array[i+1];
        }
        size--;
        return deleteIndex;
    }
    private void resize() {
        int[] newArray = new int[array.length*2];
        //从旧数组复制到新数组
        System.arraycopy(array,0,newArray,0,array.length);
        array = newArray;
    }

    public void output() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

}
