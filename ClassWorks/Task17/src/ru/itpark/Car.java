package ru.itpark;

/**
 * Created by Student7 on 12.05.2017.
 */
public class Car {
    String name;
    int number;
    int mileage;
    int fuel;

    Car() {
        name = "DEFAUL_NAME";
        number = 0;
        mileage = 0;
        fuel = 0;
    }

    Car(String name, int number, int mileage, int fuel) {
        this.name = name;
        this.number = number;
        this.mileage = mileage;
        this.fuel = fuel;
    }

    Car(Car original) {
        name = original.name;
        number = original.number;
        mileage = original.mileage;
        fuel = original.fuel;
    }

    double consumptionAverage() {
        double average = (this.fuel / this.mileage);
        return average;
    }

}
