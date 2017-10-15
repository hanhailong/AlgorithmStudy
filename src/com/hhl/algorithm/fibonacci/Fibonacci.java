package com.hhl.algorithm.fibonacci;

/**
 * 菲波那切数列
 */
public class Fibonacci {

    public static void main(String[] args) {
//菲波那切数列
        // 1.递归
//        long startTime = System.currentTimeMillis();
//
//        int result = Fibonacci.recursion(50);
//
//        System.out.println("递归结果值：" + result + ";花费时间：" + (System.currentTimeMillis() - startTime));

        // 2.循环
        long loopStart = System.currentTimeMillis();
        long loopResult = Fibonacci.traverse(50);
        System.out.println("循环结果值：" + loopResult + "；花费时间：" + (System.currentTimeMillis() - loopStart));

    }

    /**
     * 递归思想
     *
     * @param n
     * @return
     */
    public static long recursion(int n) {
        if (n < 0) throw new IllegalArgumentException("param must be >= 0");

        if (n == 0) return 0;

        if (n == 1) return 1;

        return recursion(n - 1) + recursion(n - 2);
    }


    /**
     * 循环遍历
     *
     * @param n
     * @return
     */
    public static long traverse(int n) {
        if (n < 0) throw new IllegalArgumentException("param must be >= 0");

        if (n == 0) return 0;

        if (n == 1) return 1;

        long num = 0;

        long tempOne = 0;
        long tempTwo = 1;
        for (int i = 2; i <= n; i++) {
            num = tempOne + tempTwo;

            tempOne = tempTwo;
            tempTwo = num;
        }

        return num;
    }
}
