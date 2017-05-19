package ru.itpark.inheritance;

/**
 * Created by Student21 on 19.05.2017.
 */
public class Batmobile extends SportCar {

    public Batmobile(String modelName, int volumeOfMotor, String color, int speedInKmInHours, double speedUpValue) {
        super(modelName, volumeOfMotor, color, speedInKmInHours, speedUpValue);
        System.out.println("In Batmobile constructor");
    }

    public void go() {
        System.out.println("I'm a batman!");
    }
}
