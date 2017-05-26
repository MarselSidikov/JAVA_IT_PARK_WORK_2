package ru.itpark.serialization;

import java.io.Serializable;

public class Human implements Serializable {
    private int age;
    transient private String name;
    private String bornCity;

    public Human(int age, String name, String bornCity) {
        this.age = age;
        this.name = name;
        this.bornCity = bornCity;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBornCity() {
        return bornCity;
    }

    public void setBornCity(String bornCity) {
        this.bornCity = bornCity;
    }
}
