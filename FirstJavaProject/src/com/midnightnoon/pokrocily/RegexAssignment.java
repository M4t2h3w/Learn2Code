package com.midnightnoon.pokrocily;

import java.util.regex.*;

public class RegexAssignment {
    public static void main(String[] args) {

        String inputString = "info@midnightnoon.com";
        String password = "3peSsyst";
        String picture = "some_picture.png";
        String date = "12/12/2020";
        String sentence = "This is Sample Sentence with some Capital letters.";
        String someOtherString = "1 duck once find 4 ducklings.";

        System.out.println(checkEmailValidity(inputString));
        System.out.println(passwordValidity(password));
        System.out.println(pictureChecker(picture));
        System.out.println(checkDateFormat(date));

        /*
        5. úloha: Napíš metódu, ktorá pomocou regulárneho výrazu vypíše
        na konzolu všetky slová začínajúce na veľké písmeno.
         */
        displayRegexResults("\\b[A-Z][\\w]*\\b", sentence);

        /*
        6. úloha: Napíš metódu, ktorá pomocou regulárneho výrazu nájde
        všetky čísla v texte a vypíše ich na konzolu.
         */
        displayRegexResults("\\d", someOtherString);
    }

    private static void displayRegexResults(String pattern, String input) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);

        boolean found = false;

        while(m.find()) {
            System.out.println(m.group());
            found = true;
        }
        if(!found) System.out.println("Nothing here.");
    }

    /*
    * 4. úloha: Napíš metódu, ktorá zistí, či daný String má správny tvar dátumu.
    * Uvažuj, že správny tvar je nasledujúci: dd/mm/yyyy. Kde dd je den vo
    * formáte 01 pre prvý deň. Kde mm je mesiac vo formáte 02 pre február.
    * Kde yyyy je rok vo formáte 2018.
     * */
    private static boolean checkDateFormat(String date) {
        String regex = "[0-3][0-9]/[0-1][0-9]/\\d{4}";

        return date.matches(regex);
    }

    /*
    * 3. úloha: Napíš metódu, ktorá overí, či daný String je o
    * brázok = koncovka je jedna z nasledujúcich: .jpg, .png, .jpeg, .bmp
     * */
    private static boolean pictureChecker(String picture) {
        String regex =".+\\.(png|jpg|bmp|jpeg)";

        return picture.matches(regex);
    }

    /*
    * 2. úloha: Napíš metódu, ktorá overí zložitosť zadaného hesla.
    * Na vstupe metódy bude heslo. Metóda preverí či heslo spĺňa nasledovné kritéria:
     * minimálne 8 znakov
     * musí obsahovať aspoň jedno veľké písmeno
     * musí obsahovať aspoň jedno číslo
    * */
    private static boolean passwordValidity(String password) {
        String regex = "^(?=.*[A-Z]+)(?=.*\\d)[A-Za-z\\d\\W]{8,}$";

        return password.matches(regex);
    }

    /*
    * 1. úloha: Napíš metódu, ktorá bude akceptovať na vstupe String
    * predstavujúci email. Metóda overí, či je email v správnom formáte.
    * Metóda vráti true ak áno inak false.
    * */
    private static boolean checkEmailValidity(String inputString) {
        String regex = "\\w+@\\w+.\\w+";

        return inputString.matches(regex);
    }
}
