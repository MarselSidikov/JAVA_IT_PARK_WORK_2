package ru.itpark.d;

public class Main {
    public static void main(String[] args) {
        Printer printer = new ChecksPrinter("OOO MARSEL");
        Printer printer2 = new RedCheckPrinter("OOO RUSTAM");
        Terminal terminal = new Terminal(printer2);
        terminal.give(100);
    }
}
