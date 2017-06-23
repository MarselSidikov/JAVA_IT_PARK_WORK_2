package ru.itpark.checked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Program {
    public static void openFile1(String fileName) {
        try {
            FileInputStream fileInputStream =
                    new FileInputStream("input.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void openFile2(String fileName) throws FileNotFoundException {
        FileInputStream fileInputStream =
                new FileInputStream("input.txt");
    }
    public static void main(String[] args) {
        openFile1("input.txt");

        try {
            openFile2("input.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
