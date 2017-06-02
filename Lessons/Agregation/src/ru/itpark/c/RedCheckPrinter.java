package ru.itpark.c;

public class RedCheckPrinter {
    private String header;

    public RedCheckPrinter(String header) {
        this.header = header;
    }

    public void printCheck(int cash) {
        System.err.println(header + "\n" + "You get " + cash);
    }

    public void killClient() {
        System.err.println("You died");
    }
}
