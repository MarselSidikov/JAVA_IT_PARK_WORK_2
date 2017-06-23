package ru.itpark;

import java.util.Scanner;

/**
 * Created by Student21 on 23.06.2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonDataVerifier verifier = new PersonDataVerifier();
        while (true) {
            String name = scanner.nextLine();
            try {
                verifier.verifyName(name);
                return;
            } catch (IncorrectNameOrSurnameException e) {
                System.out.println("Неверное имя");
                System.out.println("Попробуйте еще раз");
            }
        }
    }
}
