package ru.itpark.inheritance;

public class SportCar extends Car {

    private double speedUpValue;

    public SportCar(String modelName, int volumeOfMotor, String color, int speedInKmInHours, double speedUpValue) {
        super(modelName, volumeOfMotor, color, speedInKmInHours);
        this.setSpeedUpValue(speedUpValue);
        System.out.println("In Sportcar constructor");
    }

    // переопределение
    public void go() {
        System.out.println("Go with speed " + super.speedInKmInHours * speedUpValue);
    }

    // перегрузка
    public void go(int distance) {
        System.out.println("Go " + distance + "with speed " + super.speedInKmInHours * speedUpValue);
    }
    public double getSpeedUpValue() {
        return speedUpValue;
    }

    public void setSpeedUpValue(double speedUpValue) {
        if (speedUpValue > 0) {
            this.speedUpValue = speedUpValue;
        } else this.speedUpValue = 1.1;
    }
}
