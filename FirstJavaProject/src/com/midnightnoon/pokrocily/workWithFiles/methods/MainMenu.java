package com.midnightnoon.pokrocily.workWithFiles.methods;

import java.io.IOException;

public class MainMenu {
    public void showMainMenu() {
        System.out.println("Main menu: ");
        System.out.println("1. print text file content.");
        System.out.println("2. add line to text file");
        System.out.println("3. show longest word in text file");
        System.out.println("4. show file size");
        System.out.println("5. isFile or isDirectory?");
        System.out.println("6. show directory content");
        System.out.println("7. delete file");
        System.out.println("8. copy file");
        System.out.println("9. create new file and show the absolute path");
        System.out.println("Enter 'q' to exit");
        System.out.print("\nYour choice: ");
    }

    public void runMethod(String input) throws IOException {
        switch (input){
            case "1":
                System.out.println("\n1. print text file content:");
                MyMethods.printFileContent();
                break;
            case "2":
                System.out.println("\n2. add line to text file:");
                MyMethods.addLineToFile();
                break;
            case "3":
                System.out.println("\n3. show longest word in text file:");
                MyMethods.longestWordInFile();
                break;
            case "4":
                System.out.println("\n4. show file size:");
                MyMethods.showFileSize();
                break;
            case "5":
                System.out.println("\n5. isFile or isDirectory:");
                MyMethods.isFileOrDirectory();
                break;
            case "6":
                System.out.println("\n6. show directory content");
                MyMethods.showDirectoryContent();
                break;
            case "7":
                System.out.println("\n7. delete file");
                MyMethods.deleteFile();
                break;
            case "8":
                System.out.println("\n8. copy file");
                MyMethods.copyFile();
                break;
            case "9":
                System.out.println("\n9. create new file");
                MyMethods.createNewFile();
                break;
            default:
                System.out.println("Wrong input!");
                break;
        }
    }
}
