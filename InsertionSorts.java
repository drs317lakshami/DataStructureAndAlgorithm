package com.bridgelabz.algorithm;

import java.util.Arrays;

public class InsertionSorts {

    public static void main(String args[]) {

        int[] arr = {3, 1, 12, 6, 33, 22, 45};

        for (int i=0; i<arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}