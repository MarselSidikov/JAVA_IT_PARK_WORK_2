package ru.itpark.overload;

public class Main {
    public static void main(String[] args) {
        Summator summator = new Summator();
        int x = summator.sum(6, 7);
        System.out.println(x);
        x = summator.sum(5, 6, 7);
        System.out.println(x);
    }
}
