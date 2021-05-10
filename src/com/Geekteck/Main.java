package com.Geekteck;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] number = {1.4, 3.2, 6.3, 8.2, 3.8, -2.1, 3.4, 1.9, -3.7, 4.1, 2.4, -3.1};
        double sum = 0;
        int quantity = 0;
        boolean isNegative = false;

        for (double num : number) {
            if (num < 0) {
                isNegative = true;
            } else if (isNegative) {
                sum += num;
                quantity++;
            }

        }
        double aritmeticMeanNumber = sum / quantity;
        System.out.println(aritmeticMeanNumber + "\n");

        //на сообразительность
        double[] arrays = {1.4, 3.2, -6.3, 8.2, 3.8, -2.1, 3.4, 1.9, -3.7, 4.1, -2.4, 3.1};
        boolean isSorted = true;
        while (isSorted) {
            isSorted = false;
            for (int i = 1; i < arrays.length; i++) {
                if (arrays[i - 1] > arrays[i]) {
                    double tmp = arrays[i];
                    arrays[i] = arrays[i - 1];
                    arrays[i - 1] = tmp;
                    isSorted = true;

                }
            }
            System.out.println("\n" + Arrays.toString(arrays) );
        }
    }
}
