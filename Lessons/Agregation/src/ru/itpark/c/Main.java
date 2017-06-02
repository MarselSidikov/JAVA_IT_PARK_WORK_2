package ru.itpark.c;

public class Main {
    public static void main(String[] args) {
        ChecksPrinter printer = new ChecksPrinter("OOO MARSEL");
        Terminal terminal = new Terminal(printer);
        terminal.give(100);
    }
}
