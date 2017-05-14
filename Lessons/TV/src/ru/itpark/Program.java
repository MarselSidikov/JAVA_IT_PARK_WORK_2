package ru.itpark;

public class Program {
    private String name;
    private String showMan;

    public Program(String name, String showMan) {
        this.name = name;
        this.showMan = showMan;
    }

    public void show() {
        System.out.println("Привет, с вами "
                + showMan
                + ", и это передача "
                + "\"" + name + "\"");
    }
}
