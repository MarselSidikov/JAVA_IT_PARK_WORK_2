   package ru.itpark;

/**
 * Created by Student21 on 12.05.2017.
 */
public class Main2 {
    static double marksAverage(Student student) {
        double average = (student.russianLanguageMark +
                student.mathMark + student.physicsMark) / 3.0;
        return average;
    }

    public static void main(String[] args) {
        // Задача посчитать среднюю оценку по балам
        Student marsel =
                new Student("Marsel", 9515, 5, 4, 5);

        Student rinata = new Student();
        rinata.name = "Rinata";
        rinata.groupNumber = 723112;
        rinata.russianLanguageMark = 5;
        rinata.mathMark = 5;
        rinata.physicsMark = 5;

        double marksAverageOfMarsel = marksAverage(marsel);
        double marksAverageOfRinata = marksAverage(rinata);
        System.out.println(marksAverageOfMarsel);
        System.out.println(marksAverageOfRinata);

    }
}
