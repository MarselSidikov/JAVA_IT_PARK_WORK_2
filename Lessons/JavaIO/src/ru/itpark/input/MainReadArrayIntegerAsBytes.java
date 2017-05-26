package ru.itpark.input;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class MainReadArrayIntegerAsBytes {
    public static void main(String[] args) throws Exception {
        InputStream stream = new FileInputStream("input.txt");
        /*
        int byteFromFile = stream.read();
        System.out.println(byteFromFile);
        byteFromFile = stream.read();
        System.out.println(byteFromFile);
        */
        int bytes[] = new int[20];
        int currentByte = stream.read();
        int i = 0;
        while (currentByte != -1) {
            bytes[i] = currentByte;
            i++;
            currentByte = stream.read();
        }

        System.out.println(Arrays.toString(bytes));

        for (int j = 0; j < i; j++) {
            System.out.print((char)bytes[j]);
        }
    }
}
