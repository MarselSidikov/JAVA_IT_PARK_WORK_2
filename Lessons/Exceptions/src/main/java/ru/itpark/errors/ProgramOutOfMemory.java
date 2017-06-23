package ru.itpark.errors;

public class ProgramOutOfMemory {
    public static void run() {
        Object objects = new Object[1000000000];
    }
    public static void main(String[] args) {
        run();
    }
}
