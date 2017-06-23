package ru.itpark.catches;

import java.util.Scanner;

/**
 * Created by Student21 on 23.06.2017.
 */
public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            try {
                System.out.println(a / b);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                System.out.println("Введи нормальные числа.");
            }
        }
    }
}
