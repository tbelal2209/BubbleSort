package com.company;

public class BubbleSort {
    public static void bubbleSort(int[] testArr) {
        boolean swapped = true;
        while (swapped) {
            for (int i = 1; i < testArr.length; i++) {
                int temp = 0;
                if (testArr[i - 1] > testArr[i]) {
                    temp = testArr[i - 1];
                    testArr[i - 1] = testArr[i];
                    testArr[i] = temp;
                    swapped = true;
                    System.out.println(testArr);
                }
            }
        }
    }
}
