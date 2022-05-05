package com.design.pattern.strategy.sort;

import java.util.Arrays;

/**
 * @author Yue YanZhi
 * @description TODO
 * @date 2022-04-26 10:03
 * 冒泡排序
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = new int[]{5, 8, 6, 3, 9, 2, 1, 7};
        int[] arrayExtend = new int[]{3, 4, 2, 1, 5, 6, 7, 8};
            sortExtend(arrayExtend);
        System.out.println(Arrays.toString(arrayExtend));
        //sortOptimize(array);
       // System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int i1 = 0; i1 < array.length - i - 1; i1++) {
                int temp = 0;
                if (array[i1] > array[i1 + 1]) {
                    temp = array[i1];
                    array[i1] = array[i1 + 1];
                    array[i1 + 1] = temp;
                }
            }
        }
    }

    /**
     * 利用布尔变量isSorted作为标记，如果在本轮排序中，元素有交换，则说明数列无序，如果没有元素交换，则说明数列已然有序
     * 直接跳出大循环
     *
     * @param array
     */
    public static void sortOptimize(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            //有序标记每一轮都是true
            boolean isSorted = true;
            for (int i1 = 0; i1 < array.length - i - 1; i1++) {
                int temp = 0;
                if (array[i1] > array[i1 + 1]) {
                    temp = array[i1];
                    array[i1] = array[i1 + 1];
                    array[i1 + 1] = temp;
                    //因为有元素交换所以不是有序的，标记为false
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
    }

    public static void sortExtend(int[] array) {
        //记录最后一次交换的位置
        int lastExchangeIndex = 0;
        //无序数列的边界，每次比较只需要比到这里为止
        int sortBorder = array.length - 1;
        for (int i = 0; i < array.length - 1; i++) {
            //有序标记每一轮都是true
            boolean isSorted = true;
            for (int j = 0; j < sortBorder; j++) {
                int temp =0;
                if (array[j]>array[j+1]){
                    temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    //因为有元素交换，所以不会有序的，标记为false
                    isSorted = false;
                    //更新为最后一次交换元素的位置
                    lastExchangeIndex = j;
                }
            }
            sortBorder = lastExchangeIndex;
            if (isSorted){
                break;
            }
        }
    }
}
