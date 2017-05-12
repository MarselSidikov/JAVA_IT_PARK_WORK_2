package ru.itpark.models;

public class Student {

    private String name;
    private int groupNumber;
    private int russianLanguageMark;
    private int mathMark;
    private int physicsMark;

    public Student() {
        name = "DEFAULT_NAME";
        groupNumber = 0;
        russianLanguageMark = 1;
        mathMark = 1;
        physicsMark = 1;
    }

    public Student(String name, int groupNumber, int russianLanguageMark, int mathMark, int physicsMark) {
        this.setName(name);
        this.setGroupNumber(groupNumber);
        this.setRussianLanguageMark(russianLanguageMark);
        this.setMathMark(mathMark);
        this.setPhysicsMark(physicsMark);
    }

    public Student(Student original) {
        name = original.name;
        groupNumber = original.groupNumber;
        russianLanguageMark = original.russianLanguageMark;
        mathMark = original.mathMark;
        physicsMark = original.physicsMark;
    }

    double marksAverage() {
        double average = (this.russianLanguageMark +
                this.mathMark + this.physicsMark) / 3.0;
        return average;
    }

    public void setPhysicsMark(int physicsMark) {
        if (physicsMark >= 2 && physicsMark <= 5) {
            this.physicsMark = physicsMark;
        } else System.err.println("Неккоректная оценка");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroupNumber(int groupNumber) {
        if (groupNumber >= 0) {
            this.groupNumber = groupNumber;
        } else System.err.println("Неккоректный номер группы");
    }

    public void setRussianLanguageMark(int russianLanguageMark) {
        if (russianLanguageMark >= 2 && russianLanguageMark <= 5) {
            this.russianLanguageMark = russianLanguageMark;
        } else System.err.println("Неккоректная оценка");
    }

    public void setMathMark(int mathMark) {
        if (mathMark >= 2 && mathMark <= 5) {
            this.mathMark = mathMark;
        } else System.err.println("Неккоректная оценка");
    }

    public String getName() {
        return this.name;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public int getRussianLanguageMark() {
        return russianLanguageMark;
    }

    public int getMathMark() {
        return mathMark;
    }

    public int getPhysicsMark() {
        return physicsMark;
    }
}
