package com.hhl.algorithm.selectsort;

/**
 * 选择排序
 * n个数据，第一次遍历查询n次，第二次遍历查询n-1次，第三次n-2次，每次查询平均查询n/2次，
 * 一共查询n次，所以时间复杂度为O(n*n/2) = O(n^2)
 */
public class SelectSort {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] target = new int[]{90, 10, 23, 8, 70, 43, 30, 130, 100, 5, 32, 80};

        System.out.println("选择排序前的数组是：");

        for (int i : target) {
            System.out.print(i + ",");
        }
        System.out.println();

        System.out.println("选择排序后的数组是：");

        for (int i : selectSort(target)) {
            System.out.print(i + ",");
        }
    }

    /**
     * 选择排序
     *
     * @param target
     * @return
     */
    public static int[] selectSort(int[] target) {
        int len = target.length;

        for (int i = 0; i < len; i++) {//一共遍历N次，每次找出最小的值

            int minIndex = i;

            //开始进行
            for (int j = i + 1; j < len; j++) {
                if (target[j] < target[minIndex]) {
                    minIndex = j;
                }
            }

            //将最小值放到最前面
            if (minIndex > i) {
                int temp = target[i];
                target[i] = target[minIndex];
                target[minIndex] = temp;
            }
        }

        return target;
    }
}
