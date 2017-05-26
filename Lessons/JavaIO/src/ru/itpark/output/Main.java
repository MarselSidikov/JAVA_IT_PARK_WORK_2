package ru.itpark.output;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        OutputStream stream = new FileOutputStream("output.txt");
        String text = "Hello! Милашка";
        byte bytes[] = text.getBytes();
        stream.write(bytes);
    }
}
