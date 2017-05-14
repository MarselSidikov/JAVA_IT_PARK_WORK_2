package ru.itpark;

public class Channel {
    // final - константа, менять нельзя
    private final int MAX_PROGRAMS = 5;

    private String name;

    private Program programs[];
    private int countOfPrograms;

    public Channel(String name) {
        this.name = name;
        this.countOfPrograms = 0;
        this.programs = new Program[MAX_PROGRAMS];
    }

    public void addProgram(Program program) {
        if (countOfPrograms < MAX_PROGRAMS) {
            programs[countOfPrograms] = program;
            countOfPrograms++;
        } else {
            System.err.println("План сетка перегружена");
        }
    }

    public void on() {
        System.out.println("Канал: " + "\"" + name + "\"");
        for (int i = 0; i < countOfPrograms; i++) {
            programs[i].show();
        }
    }
}
