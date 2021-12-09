package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {23.34, -54.34, -57.56, 76.5, 87.4, 898.7, -675.5, 689.7, 797.7, -45.6, 87.7, 34.8, -79.7, -90.6, 54.7};
        double sum = 0;
        int all = 0;
        boolean isTrue = false;
        for (double elements : numbers) {
            if (elements < 0) {
                isTrue = true;
            } else if (isTrue) {
                all++;
                sum = sum + elements;
            }
        }
        System.out.println(sum / all);
        min();
    }

    // Доп дз

    public static void min() {
        double[] numbers = {23.34, -54.34, -57.56, 76.5, 87.4, 898.7, -675.5, 689.7, 797.7, -45.6, 87.7, 34.8, -79.7, -90.6, 54.7};
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
