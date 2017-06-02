package ru.itpark.b;

import ru.itpark.c.RedCheckPrinter;

public class Terminal {
    private final static int START_MONEY = 100;

    // private ChecksPrinter printer;
    private RedCheckPrinter printer;
    private int money;

    public Terminal() {
        this.money = START_MONEY;
        // this.printer = new ChecksPrinter("OOO MARSEL");
        this.printer = new RedCheckPrinter("OOO MARSEL");
    }

    public int give(int cash) {
        this.money = this.money - cash;
        printer.printCheck(cash);
        return cash;
    }
}
