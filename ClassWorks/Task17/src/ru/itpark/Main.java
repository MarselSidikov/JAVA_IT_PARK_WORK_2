package ru.itpark;

public class Main {

    public static void main(String[] args) {
        Car my =
                new Car("my", 9515, 5, 4);
        
        double marksAverageOfMy = my.consumptionAverage();
        System.out.println(marksAverageOfMy);

    }
}
