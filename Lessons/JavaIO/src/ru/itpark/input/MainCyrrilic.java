package ru.itpark.input;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class MainCyrrilic {

    public static void main(String[] args) throws Exception {
        InputStream stream = new FileInputStream("input2.txt");
        int byteFromFile = stream.read();
        System.out.println(byteFromFile);
        System.out.println((char)byteFromFile);
    }
}
