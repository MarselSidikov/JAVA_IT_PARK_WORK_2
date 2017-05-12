package ru.itpark;

public class Student {
    // состояние студента
    // набор его характеристик

    // каждая характеристика имеет
    // тип и имя

    // характеристики, указанные внутри
    // класса называются - полями (fields)
    // поля - члены класса
    String name;
    int groupNumber;
    int russianLanguageMark;
    int mathMark;
    int physicsMark;

    // Конструктор пользовательский без параметров
    Student() {
        name = "DEFAULT_NAME";
        groupNumber = 0;
        russianLanguageMark = 1;
        mathMark = 1;
        physicsMark = 1;
    }

    // Конструктор пользовательский с параметрами
    Student(String name, int groupNumber, int russianLanguageMark, int mathMark, int physicsMark) {
        this.name = name;
        this.groupNumber = groupNumber;
        this.russianLanguageMark = russianLanguageMark;
        this.mathMark = mathMark;
        this.physicsMark = physicsMark;
    }

    // Конструктор пользовательский копирования
    Student(Student original) {
        name = original.name;
        groupNumber = original.groupNumber;
        russianLanguageMark = original.russianLanguageMark;
        mathMark = original.mathMark;
        physicsMark = original.physicsMark;
    }

    // Метод вычисления среднего значения по экзаменам
    double marksAverage() {
        double average = (this.russianLanguageMark +
                this.mathMark + this.physicsMark) / 3.0;
        return average;
    }

}
