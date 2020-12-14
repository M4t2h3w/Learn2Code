package com.midnightnoon.zaciatocnik;

public class NestedAssignments {
    public static void main(String[] args) {
        firstShape(5);
        System.out.println();
        secondShape(4);

    }

    private static void firstShape(int input) {
        for (int i = input; i > 0; i --) {
            for (int j = i; j > 0; j --) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void secondShape(int input) {
        for (int i = 0; i < input; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
