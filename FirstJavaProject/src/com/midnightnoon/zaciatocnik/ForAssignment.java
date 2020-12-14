package com.midnightnoon.zaciatocnik;

public class ForAssignment {

    public static void main(String[] args) {
        countdown(4);
        pyramid(4);
        replacingNumber(4);
    }

    private static void replacingNumber(int i) {
        for (int j = 1; j <= i; j++) {
            for (int k = 1; k <= i; k++) {
                if (k == j) {
                    System.out.print("_" + " ");
                }
                else {
                    System.out.print(k + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void pyramid(int i) {
        for (int j = 1; j <= i; j++) {
            for (int k = 1; k <= j; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void countdown(int i) {
        for (; i > 0; i--) {
            int j = 1;
            while (j <= i) {
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
        }
        System.out.println();
    }
}
