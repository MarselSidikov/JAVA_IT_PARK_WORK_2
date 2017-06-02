package ru.itpark.c;

public class Terminal {
    private final static int START_MONEY = 100;

    private ChecksPrinter printer;
    private int money;

    public Terminal(ChecksPrinter printer) {
        this.money = START_MONEY;
        this.printer = printer;
    }

    public int give(int cash) {
        this.money = this.money - cash;
        printer.printCheck(cash);
        return cash;
    }
}
