package com.midnightnoon.zaciatocnik;

public class SwitchAssignments {
    public static void main(String[] args) {
        System.out.println(dayOfWeek(3));
        System.out.println(finalMark(1, 2, 1, 3, 4));
    }

    private static String dayOfWeek(int i) {
        String result = "";
        switch (i) {
            case 1:
                result =  "Monday";
                break;
            case 2:
                result =  "Tuesday";
                break;
            case 3:
                result =  "Wednesday";
                break;
            case 4:
                result =  "Thursday";
                break;
            case 5:
                result =  "Friday";
                break;
            case 6:
            case 7:
                result =  "Weekend";
                break;
            default:
                result =  "Wrong input.";
                break;
        }
        return result;
    }

    private static int finalMark(int i, int i1, int i2, int i3, int i4) {
        double result = (i + i1 + i2 + i3 + i4) / 5.0;
        int finalMark = 1;
        if (result <= 1.5) finalMark = 1;
        else if (result > 1.5 && result <= 2.5) finalMark = 2;
        else if (result > 2.5 && result <= 3.5) finalMark = 3;
        else if (result > 3.5 && result <= 4.5) finalMark = 4;
        else if (result > 4.5) finalMark = 5;
        return finalMark;
    }
}
