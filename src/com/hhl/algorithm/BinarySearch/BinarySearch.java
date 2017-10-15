package com.hhl.algorithm.BinarySearch;

/**
 * 二分查找，时间复杂度为logN（底数为2），对数运算
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] source = new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21};

        System.out.println("搜索位置为：" + binarySearch(source, 21));
    }

    /**
     * 二分法查找出某个元素的位置
     *
     * @param source 源数据
     * @param target 目标
     * @return
     */
    public static int binarySearch(int[] source, int target) {
        if (source == null || source.length <= 0) return -1;

        int low = 0;
        int high = source.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int value = source[mid];
            if (value == target) {
                return mid;
            } else if (value < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
