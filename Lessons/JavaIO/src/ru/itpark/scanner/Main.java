package ru.itpark.scanner;

import java.io.FileInputStream;
import java.util.Scanner;

/**
 * Created by Student21 on 26.05.2017.
 */
public class Main {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(new FileInputStream("scanner.txt"));
        int number = scanner.nextInt();
        String message = scanner.next();
        boolean b = scanner.nextBoolean();
        System.out.println(number + " " + message + " " + b);
    }
}
