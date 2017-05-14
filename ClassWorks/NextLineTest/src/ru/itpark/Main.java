package ru.itpark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String hello = scanner.nextLine();
        System.out.println("Введите возраст:");
        String bye = scanner.nextLine();
        System.out.println("Введите фамилию:");
        String good = scanner.nextLine();
        System.out.println(hello + bye + good);
    }
}
