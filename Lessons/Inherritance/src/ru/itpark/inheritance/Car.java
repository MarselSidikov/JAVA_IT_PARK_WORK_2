package ru.itpark.inheritance;

public class Car {
    private String modelName;
    private int volumeOfMotor;
    private String color;
    protected int speedInKmInHours;

    public Car(String modelName, int volumeOfMotor, String color, int speedInKmInHours) {
        this.modelName = modelName;
        this.setVolumeOfMotor(volumeOfMotor);
        this.color = color;
        this.setSpeedInKmInHours(speedInKmInHours);
        System.out.println("In car constructor");
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getVolumeOfMotor() {
        return volumeOfMotor;
    }

    public void setVolumeOfMotor(int volumeOfMotor) {
        if (volumeOfMotor >= 0) {
            this.volumeOfMotor = volumeOfMotor;
        } else this.volumeOfMotor = 1;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeedInKmInHours() {
        return speedInKmInHours;
    }

    public void setSpeedInKmInHours(int speedInKmInHours) {
        if (speedInKmInHours >= 0) {
            this.speedInKmInHours = speedInKmInHours;
        } else this.speedInKmInHours = 1;
    }

    public void go() {
        System.out.println("Go with speed " + speedInKmInHours);
    }
}

