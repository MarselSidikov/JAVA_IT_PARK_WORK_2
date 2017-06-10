package ru.itpark;

import com.google.common.base.MoreObjects;

public class Human {
    private int age;
    private String name;
    private String sex;
    private int height;

    public Human(int age, String name, String sex, int height) {
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.height = height;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("Имя", name)
                .add("Возраст", age)
                .add("Пол", sex)
                .add("Рост", height)
                .toString();
    }
}
