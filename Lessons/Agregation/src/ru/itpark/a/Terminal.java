package ru.itpark.a;

public class Terminal extends ChecksPrinter {
    private final static int START_MONEY = 100;

    private int money;

    public Terminal() {
        this.money = START_MONEY;
    }

    public int give(int cash) {
        this.money = this.money - cash;
        printCheck(cash);
        return cash;
    }
}
