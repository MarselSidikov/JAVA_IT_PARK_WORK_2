package ru.itpark.throwexception;


import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IncorrectRussianPhoneCode {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        if (!line.startsWith("+7")) {
            throw new IncorrectRussianPhoneCode();
        }
        if (line.startsWith("+7")
                && line.length() == 12) {
            System.out.println("Номер кооректный");
        } else {
            throw new IncorrectPhoneNumber();
        }
    }
}
