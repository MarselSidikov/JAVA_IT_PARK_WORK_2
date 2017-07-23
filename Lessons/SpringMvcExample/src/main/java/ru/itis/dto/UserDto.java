package ru.itis.dto;

import ru.itis.models.Auto;
import ru.itis.models.User;

import java.util.ArrayList;
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

    public static UserDto fromModel(User user) {
        List<Auto> userAutos = user.getAutos();

        List<AutoDto> autoDtos = new ArrayList<>();
        for (Auto auto : userAutos) {
            AutoDto autoDto = AutoDto.fromModel(auto);
            autoDtos.add(autoDto);
        }
        return new UserDto(user.getId(),
                user.getName(),
                user.getHeight(),
                user.getAge(),
                autoDtos);
    }

    public static List<UserDto> fromModels(List<User> users) {
        List<UserDto> result = new ArrayList<>();
        for (User user : users) {
            result.add(UserDto.fromModel(user));
        }
        return result;
    }
}
