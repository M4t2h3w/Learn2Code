package com.midnightnoon.pokrocily.workWithFiles.methods;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.sql.SQLOutput;
import java.util.Scanner;

public class MyMethods {

    /**
     * 1. úloha: Napíš program, ktorý prečíta jednoduchý textový súbor a vypíše jeho text na konzolu.
     */
    public static void printFileContent() {
        Path p = Paths.get("/Users/matej/Documents/IntelliJ Idea projects/FirstJavaProject/src/com/midnightnoon/pokrocily/workWithFiles/methods/text.txt");

        try(Scanner scanner = new Scanner(Files.newBufferedReader(p))){
            while(scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("File not existing!");
        }
    }

    /**
     * 2. úloha: Napíš program, ktorý k textovému súboru pridá ďalší riadok.
     */
    public static void addLineToFile() {
        Path p = Paths.get("/Users/matej/Documents/IntelliJ Idea projects/FirstJavaProject/src/com/midnightnoon/pokrocily/workWithFiles/methods/text.txt");

        System.out.print("Enter text to append: ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        try(PrintWriter outputStream = new PrintWriter(new FileWriter(p.toString(), true))){
            outputStream.append("\n" + input);
        } catch (IOException e) {
            System.out.println("File not existing!");
            e.printStackTrace();
        }
    }

    /**
     * 3. úloha: Napíš program, ktorý nájde najdlhšie slovo z textového súboru a vypíše ho na konzolu.
     */
    public static void longestWordInFile() {
        Path p = Paths.get("/Users/matej/Documents/IntelliJ Idea projects/FirstJavaProject/src/com/midnightnoon/pokrocily/workWithFiles/methods/text.txt");

        try(Scanner scanner = new Scanner(new FileInputStream(p.toString()))){
            scanner.useDelimiter("[\\s.,]");
            String longestString = "";
            while(scanner.hasNext()) {
                String currentInput = scanner.next();
                if(currentInput.length() > longestString.length()) longestString = currentInput;
            }
            System.out.println("Longest String is: " + longestString);
        } catch (IOException e) {
            System.out.println("File not existing!");
        }
    }

    /**
     * 4. úloha: Napíš program, ktorý vypíše veľkosť súboru na konzolu.
     */
    public static void showFileSize() throws IOException {
        Path p = Paths.get("/Users/matej/Documents/IntelliJ Idea projects/FirstJavaProject/src/com/midnightnoon/pokrocily/workWithFiles/methods/text.txt");

        if(Files.exists(p)) System.out.println(Files.size(p) + " byte(s)");
    }

    /**
     * 5. úloha: Napíš metódu. Vstupom metódy bude String predstavujúci cestu k súboru.
     * Metóda zistí, či je daný String súbor alebo priečinok.
     * Na konzolu vypíš názov súboru alebo priečinku.
     */
    public static void isFileOrDirectory() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file/directory path: ");
        Path p = Paths.get(scanner.nextLine());

        if(Files.exists(p)) {
            if(Files.isDirectory(p)) {
                System.out.println(p.getFileName() + " is directory");
            }
            if(!Files.isDirectory(p)) {
                System.out.println(p.getFileName() + " is not a directory");
            }
        }
    }

    /**
     * 6. úloha: Napíš program, ktorému zadáš cestu na priečinok.
     * Program vypíše názvy všetkých súborov priamo v danom priečinku.
     */
    public static void showDirectoryContent() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter directory path: ");
        Path p = Paths.get(scanner.nextLine());

        if(Files.exists(p) && Files.isDirectory(p)) {
            Files.list(p).limit(10).forEach(path -> System.out.println(path.getFileName()));
        }
    }

    /**
     * 7. úloha: Napíš metódu, ktorá zmaže súbor na základe zadaného Stringu, ktorý ako hodnotu má cestu k súboru.
     * @throws IOException
     */
    public static void deleteFile() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file path to delete: ");
        Path p = Paths.get(scanner.nextLine());

        if(Files.exists(p)) {
            System.out.print("Are you sure you want to delete " + p.getFileName() + "? (Y)");
            if (scanner.nextLine().equals("Y")) {
                System.out.println("Deleting file...");
                Files.delete(p);
            }
            else System.out.println("File not deleted.");
        }
        else System.out.println("File not exists.");
    }

    /**
     * 8. úloha: Napíš program, ktorý skopíruje súbor z jedného priečinku do druhého.
     */
    public static void copyFile() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter source file path: ");
        Path source = Paths.get(scanner.nextLine());

        System.out.print("Enter target path: ");
        Path target = Paths.get(scanner.nextLine());

        if(Files.exists(source)) {
            System.out.println("Copying file " + source.getFileName());
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
        }

    }

    /**
     * 9. úloha: Napíš metódu, ktorej vstupom bude názov súboru.
     * Napríklad text.txt. Metóda vytvorí nový súbor s týmto názvom.
     * 10. úloha: Modifikuj úlohu 9. Metóda vráti plnú cestu na tento súbor.
     */
    public static void createNewFile() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file name to create: ");
        Path p = Paths.get(scanner.nextLine());

        File file = new File(p.toString());

        file.createNewFile();
        System.out.println("File created");
        System.out.println(file.getAbsolutePath());
    }
}
