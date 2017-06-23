package ru.itpark.errors;


public class ProgramStackOverflow {
    public static void f() {
        f();
    }

    public static void main(String[] args) {
        f();
    }
}
