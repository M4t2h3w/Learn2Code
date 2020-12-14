package com.midnightnoon.zaciatocnik;

/*
* Return the number of occurances of given substring in input string.
*/

import java.util.HashMap;

public class FindSubstring {

    public static void main(String[] args) {
        String inputString = "This is a test of a test";
        String wantedString = "test";
        int result = lookForString(inputString, wantedString);

        System.out.println("The substring: " + "\"" + wantedString+ "\"" + " is present in input string: " + result + " time(s).");
    }

    // return no of occurances of substring in input string using Boyer-Moore algo
    // case sensitive matching

    private static int lookForString(String inputString, String wantedString) {
        int numberOfOccurances = 0;
        HashMap<Character, Integer> shiftTable = new HashMap<Character, Integer>();

        // shiftTable creation
        for (int i = 0; i < wantedString.length(); i++) {
            shiftTable.put(wantedString.charAt(i), Math.max(1, wantedString.length() - i - 1));
        }

        System.out.println(shiftTable);

        for (int i = 0; i <= inputString.length() - wantedString.length(); ) {   // start iterating the inputString from index 0
            for (int j = wantedString.length() - 1; j >= 0; j--) {   // iterate wantedString from the end
                if (wantedString.charAt(j) != inputString.charAt(i + j)) {
                    if (shiftTable.containsKey(inputString.charAt(i + j))) {
                        i +=  shiftTable.get(inputString.charAt(i + j));
                        break;
                    }
                    else i += j + 1;
                    break;
                }
                if (j == 0) {
                    numberOfOccurances++;
                    i++;
                }
            }
        }

        // TODO

        return numberOfOccurances;
    }
}
