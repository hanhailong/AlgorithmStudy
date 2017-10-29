package com.hhl.algorithm.QuickSort

fun main(args: Array<String>) {
    var source: IntArray = intArrayOf(20, 30, 5, 2, 150, 89, 34, 23, 75, 29, 99)

    //打印原数组
    println(source.contentToString())

    quickSort(source, 0, source.lastIndex)
    //快速排序之后
    println(source.contentToString())
}

/**
 * 快速排序算法，基准位置的获取很有讲究
 * 1.固定值
 * 2.随机值
 * 3.三数取中，第一个、中间、最后一个取一个中间值
 */
fun quickSort(array: IntArray, left: Int, right: Int) {
//    TODO("快速排序不好理解，明天继续完善")

    if (left < right) {
        var low = left  // 0下标
        var high = right  // 最后下标
        var key = array[low] // 关键值

        while (low < high) {
            //开始
            while (low < high && array[high] > key) {
                high--
            }

            array[low] = array[high]

            while (low < high && array[low] < key) {
                low++
            }

            array[high] = array[low]
        }

        array[low] = key

        // 递归
        quickSort(array, left, low - 1)
        quickSort(array, low + 1, right)
    }
}
