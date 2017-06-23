package ru.itpark.exception.runtime;

public class ProgramNullPointer {
    public static void main(String[] args) {
        String s = null;
        System.out.println(s.length());
    }
}
