package com.midnightnoon.pokrocily.strings;

public class StringsAssignment {
    public static void main(String[] args) {
        String inputString = "This is just a sample text, String, character, array or whatever.";
        String name = "Ethan Mathew Hunt";
        String htmlTags = "[header]Ac mi[/header] massa ac [code]praesent eget[/code], " +
                "aliquam egestas suscipit, potenti massa, porttitor [link:www.learn2code.sk] " +
                "gravida quis ac velit facilisi[/link], imperdiet massa rhoncus felis arcu. " +
                "Ut nullam, mauris vitae, ligula quisque est.";

        System.out.println("First assignment:\t" + lastLetterUpperCase(inputString));
        System.out.println("Second assignment:\t" + aToAt(inputString));
        System.out.println("Third assignment:\t" + removeAllAfterLastComma(inputString));
        System.out.println("Fourth assignment:\t" + removeTextBetweenCommas(inputString));
        System.out.println("Fifth assignment: ");
        analyzeText(inputString);
        System.out.println("Sixth assignment:\t" + removeDotsAndCommasSecondLetterUpperCase(inputString));
        System.out.println("Seventh assignment:\t" + initials(name));
        System.out.println("Eighth assignment:\n" + reformatHTML(htmlTags));
    }

    private static String reformatHTML(String htmlTags) {

        String result = htmlTags.replace("[code]", "<code>")
                                .replace("[/code]", "</code>")
                                .replace("[header]", "<h1>")
                                .replace("[/header]", "</h1>")
                                .replace("[link:www.learn2code.sk]", "< a href = \"www.learn2code.sk\">")
                                .replace("[/link] ", "</a>");

        return result;
    }

    private static String initials(String name) {
        String temp = "";
        String result = "";

        for (char ch : name.toCharArray()) {
            if (Character.isUpperCase(ch)) temp += ch;
        }
        for (int i = 0; i < temp.length(); i++) {
            if (i != temp.length()-1) {
                result += temp.charAt(i) + ".";
            }
            else result += temp.charAt(i);
        }

        return result;
    }

    private static String removeDotsAndCommasSecondLetterUpperCase(String inputString) {
        String result = "";
        int counter = 0;

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == ',' || inputString.charAt(i) == '.') {
                //result += inputString.charAt(i);
            }
            else if (Character.isLetter(inputString.charAt(i)) && counter % 2 == 0) {
                counter++;
                result += inputString.toLowerCase().charAt(i);
            }
            else if (Character.isLetter(inputString.charAt(i))) {
                counter++;
                result += inputString.toUpperCase().charAt(i);
            }
            else result += inputString.charAt(i);
        }

        return result;
    }

    private static void analyzeText(String inputString) {
        int wordsCounter = 0;
        int charCounter = 0;
        int spaceCounter = 0;
        int commasCounter = 0;
        int dotCounter = 0;
        int upperCaseLettersCounter = 0;

        for (int i = 0; i < inputString.length(); i++) {
            if (Character.isLetter(inputString.charAt(i))) charCounter++;
            else if (inputString.charAt(i) == ' ') spaceCounter++;
            else if (inputString.charAt(i) == ',') commasCounter++;
            else if (inputString.charAt(i) == '.') dotCounter++;
            if (Character.isUpperCase(inputString.charAt(i))) upperCaseLettersCounter++;
            if (Character.isLetter(inputString.charAt(i)) && i == inputString.length()-1) {
                wordsCounter++;
            }
            else if (Character.isLetter(inputString.charAt(i)) && !Character.isLetter(inputString.charAt(i+1))) {
                wordsCounter++;
            }
        }

        System.out.println("Input String: " + inputString);
        System.out.println("\tWords:\t" + wordsCounter);
        System.out.println("\tChars:\t" + charCounter);
        System.out.println("\tSpaces:\t" + spaceCounter);
        System.out.println("\tCommas:\t" + commasCounter);
        System.out.println("\tDots:\t" + dotCounter);
        System.out.println("\tCaps:\t" + upperCaseLettersCounter);
    }

    private static String removeTextBetweenCommas(String inputString) {

        String result = "";
        int commaCounter = 0;

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) != ',' && (commaCounter == 0 || commaCounter >= 2)) {
                result += inputString.charAt(i);
            }
            else if (inputString.charAt(i) == ',') {
                commaCounter++;
            }
            if (inputString.charAt(i) == ',' && commaCounter > 2) {
                result += inputString.charAt(i);
            }
        }
        return result;
    }

    private static String removeAllAfterLastComma(String inputString) {
        if (inputString.lastIndexOf(',') != -1) {
            return inputString.substring(0, inputString.lastIndexOf(','));
        }
        else return inputString;
        }

    private static String aToAt(String inputString) {
        return inputString.replace('a', '@');
    }

    private static String lastLetterUpperCase(String inputString) {

        String result = "";

        for(int i = 0; i < inputString.length();i++) {
            if(i == inputString.length()-1 && Character.isLetter(inputString.charAt(i))){
                result += inputString.toUpperCase().charAt(i);
            }
            else if (Character.isLetter(inputString.charAt(i)) &&
                    !Character.isLetter(inputString.charAt(i+1))) {
                result += inputString.toUpperCase().charAt(i);
            }
            else result += inputString.toLowerCase().charAt(i);
        }

        return result;
    }
}
