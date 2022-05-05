package com.design.pattern.strategy.sort;

import java.util.Arrays;

/**
 * @author Yue YanZhi
 * @description TODO
 * @date 2022-04-26 15:22
 * 快速排序
 */
public class SpeedinessSort {
    public static void main(String[] args) {
        int[] array = new int[]{4, 4, 6, 5, 3, 2, 8, 1};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array, int startIndex, int endIndex) {
        //递归结束条件，startIndex大于或等于endIndex
        if (startIndex >= endIndex) {
            return;
        }
        //得到基准元素位置
        int pivotIndex = partition(array, startIndex, endIndex);
        quickSort(array, startIndex, pivotIndex - 1);
        quickSort(array, pivotIndex + 1, endIndex);
    }

    /**
     * 分治 双边循环法
     *
     * @param array      待交换的数组
     * @param startIndex 起始下标
     * @param endIndex   结束下标
     * @return
     */
    private static int partition(int[] array, int startIndex, int endIndex) {
        //取第一个位置或者随机的位置作为基准元素
        int pivot = array[startIndex];
        int left = startIndex;
        int right = endIndex;
        while (left != right) {
            //控制right指针比较并左移
            while (left < right && array[right] > pivot) {
                right--;
            }
            //控制left指针比较并右移
            while (left < right && array[left] <= pivot) {
                left++;
            }
            if (left < right) {
                int p = array[left];
                array[left] = array[right];
                array[right] = p;
            }
        }
        //pivot和指针重合点交换
        array[startIndex] = array[left];
        array[left] = pivot;
        return left;
    }
}
