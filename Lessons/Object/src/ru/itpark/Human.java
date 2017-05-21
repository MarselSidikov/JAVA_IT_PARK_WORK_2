package ru.itpark;

public class Human {
    private int age;
    private String name;
    private int height;

    public Human(int age, String name, int height) {
        this.age = age;
        this.name = name;
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean equals(Object object) {
        // понижающее преобразование
        Human that = (Human)object;
        return this.age == that.age &&
                this.name == that.name &&
                this.height == that.height;
    }
}
