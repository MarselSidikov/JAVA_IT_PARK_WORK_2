package ru.itpark.b;

public class ChecksPrinter {
    private String header;

    public ChecksPrinter(String header) {
        this.header = header;
    }

    public void printCheck(int cash) {
        System.out.println(header + "\n" + "You get " + cash);
    }

    public void killClient() {
        System.out.println("You died");
    }
}
