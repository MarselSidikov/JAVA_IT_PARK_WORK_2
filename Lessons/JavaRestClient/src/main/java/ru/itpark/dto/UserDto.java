package ru.itpark.dto;

import java.util.List;

public class UserDto {
    private int id;
    private String name;
    private int height;
    private int age;
    private List<AutoDto> autos;

    public UserDto() {
    }

    public UserDto(int id, String name, int height, int age, List<AutoDto> autos) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.age = age;
        this.autos = autos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<AutoDto> getAutos() {
        return autos;
    }

    public void setAutos(List<AutoDto> autos) {
        this.autos = autos;
    }
}
