package com.design.pattern.strategy.sort;

import java.util.Arrays;

/**
 * @author Yue YanZhi
 * @description TODO
 * @date 2022-04-26 14:56
 * 鸡尾酒排序
 */
public class CocktailSort {
    public static void main(String[] args) {
        int[] array = new int[]{5, 8, 6, 3, 9, 2, 1, 7};
        int[] arrayExtend = new int[]{3, 4, 2, 1, 5, 6, 7, 8};
        cocktailSort(arrayExtend);
        System.out.println(Arrays.toString(arrayExtend));
        //sortOptimize(array);
        // System.out.println(Arrays.toString(array));
    }

    public static void cocktailSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            //有序标记每一轮都是true
            boolean isSorted = true;
            //计数轮，从左像右比较和交换
            for (int j = i; j < array.length - i - 1; j++) {
                int tmp = 0;
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    //有元素交换，所以不是有序的，标记变为false
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }

            //在偶数轮开始之前把标记设计为true
            isSorted = true;
            for (int j = array.length - i - 1; j > i; j--) {
                int tmp = 0;
                if (array[j] < array[j - 1]) {
                    tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                    //有元素交换，所以不是有序的，标记变为false
                    isSorted = false;
                }
            }
            if (isSorted){
                break;
            }
        }
    }
}
