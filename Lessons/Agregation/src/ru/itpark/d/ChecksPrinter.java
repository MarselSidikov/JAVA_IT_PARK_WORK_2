package ru.itpark.d;

public class ChecksPrinter implements Printer{
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
