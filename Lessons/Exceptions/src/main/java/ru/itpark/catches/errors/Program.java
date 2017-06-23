package ru.itpark.catches.errors;

public class Program {
    public static void f() {
        f();
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (StackOverflowError e) {
            System.out.println(e.getMessage());
            System.out.println("Здесь ошибка");
        }
    }
}
