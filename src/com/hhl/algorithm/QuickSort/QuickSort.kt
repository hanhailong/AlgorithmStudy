package com.hhl.algorithm.QuickSort

fun main(args: Array<String>) {
    var source: IntArray = intArrayOf(20, 30, 5, 2, 150, 89, 34, 23, 75, 29, 99)

    for (a in source)
        print("$a,")

    quickSort(source)
    //快速排序之后
    for (b in source)
        print("$b,")
}

/**
 * 快速排序算法，基准位置的获取很有讲究
 * 1.固定值
 * 2.随机值
 * 3.三数取中，第一个、中间、最后一个取一个中间值
 */
fun quickSort(array: IntArray) {
    TODO("快速排序不好理解，明天继续完善")
}