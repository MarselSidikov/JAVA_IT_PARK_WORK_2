package ru.itpark.models;

/**
 * Created by Student21 on 12.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        /*
        student.name = "Marsel";
        student.groupNumber = 9515;
        student.physicsMark = 5;
        student.russianLanguageMark = 5;
        student.mathMark = -10;
        */
        student.setName("Marsel");
        student.setGroupNumber(9515);
        student.setMathMark(5);
        student.setPhysicsMark(-10);
        student.setRussianLanguageMark(4);

        Student badStudent = new Student("Marsel", 123, -5, -10, 100);

        System.out.println(student.getName());
        int i = 0;
    }
}
