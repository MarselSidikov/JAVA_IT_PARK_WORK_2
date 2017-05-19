package ru.itpark.problem;

public class SportCar {
    private String modelName;
    private int volumeOfMotor;
    private String color;
    private int speedInKmInHours;

    private double speedUpValue;

    public SportCar(String modelName, int volumeOfMotor, String color, int speedInKmInHours, double speedUpValue) {
        this.modelName = modelName;
        this.setVolumeOfMotor(volumeOfMotor);
        this.color = color;
        this.setSpeedInKmInHours(speedInKmInHours);
        this.setSpeedUpValue(speedUpValue);
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

    public void go(int distance) {
        System.out.println();
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
        System.out.println("Go with speed " + speedInKmInHours * speedUpValue);
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
