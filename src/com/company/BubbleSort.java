package com.company;

public class BubbleSort {
    public static void bubbleSort(int[] testarr) {
        boolean swapped = true;
        while (swapped) {
            for (int i = 1; i < testarr.length; i++) {
                int temp = 0;
                if (testarr[i - 1] > testarr[i]) {
                    temp = testarr[i - 1];
                    testarr[i - 1] = testarr[i];
                    testarr[i] = temp;
                    swapped = true;
                }
            }
        }
    }
    }
