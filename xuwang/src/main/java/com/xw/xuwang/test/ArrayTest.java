package com.xw.xuwang.test;

import java.util.Arrays;

/**
 * @author huixia.hu
 * Date:     2020/1/7 16:43
 * @version 1.0
 */
public class ArrayTest {
    public static void main(String[] args) {
        // 数组a{1,2,3},数组b{4,5,6,7,8},合并成{1,4,2,5,3,6,7,8}
        int[] a = new int[]{1, 2, 3};
        int[] b = new int[]{4, 5, 6, 7, 8};

        int length = a.length + b.length;
        int c[] = new int[length];

        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            c[temp] = a[i];
            temp++;
            c[temp] = b[i];
            temp++;
        }

        int temp1 = 2 * a.length;
        for (int i = a.length; i < b.length; i++) {
            c[temp1] = b[i];
            temp1++;
        }

        System.out.println(Arrays.toString(c));

    }
}
