package ru.itpark.input;


import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class MainReadBytesAsArray {
    public static void main(String[] args) throws Exception {
        InputStream stream = new FileInputStream("input.txt");
        byte bytes[] = new byte[20];
        int bytesCount = stream.read(bytes);
        System.out.println(bytesCount);
        System.out.println(Arrays.toString(bytes));
    }
}
