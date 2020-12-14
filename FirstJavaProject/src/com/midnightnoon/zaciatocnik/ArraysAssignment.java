package com.midnightnoon.zaciatocnik;

public class ArraysAssignment {

    public static void main(String[] args) {
        int[][] ints = {
                {1, 2, 3, 4, 5, 6},
                {2, 20, 30, 40, 70},
                {30, 67, 1, 879, 100, 2},
                {1, 2, 3, 4, 1, 2},
        };
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[][] numbers2 = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        };
        int[][] numbers3 = {
                {1, 2, 3},
                {1, 2, 3, 4},
                {2, 10, 24, 4, 7},
                {6},
                {890, 1}
        };

        firstTwoElements(ints);
        sumOfElements(numbers);
        sumProd2D(numbers2);
        sumOnIndexes(numbers3);
    }

    private static void sumOnIndexes(int[][] numbers3) {
        int sum = 0;

        for (int i = 0; i < numbers3.length; i++) {
            for (int j = 0; j < numbers3[i].length; j++) {
                sum += numbers3[i][j];
            }
            System.out.println("Sum of values on index " + i + " == " + sum);
            sum = 0;
        }
    }

    private static void sumProd2D(int[][] numbers2) {
        int sum = 0;
        int product = 0;

        for (int i = 0; i < numbers2.length; i++) {
            for (int j = 0; j < numbers2[i].length; j++) {
                sum += numbers2[i][j];
                if (i == 0 && j == 0) {
                    product = numbers2[i][j];
                }
                else product *= numbers2[i][j];
            }
        }

        System.out.println("Sum == " + sum);
        System.out.println("Product == " + product);
    }

    private static void sumOfElements(int[] numbers) {
        int sum = numbers[0];
        int product = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            sum += numbers[i];
            product *= numbers[i];
        }
        System.out.println("Sum == " + sum);
        System.out.println("Priduct == " + product);
    }

    private static void firstTwoElements(int[][] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(ints[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
