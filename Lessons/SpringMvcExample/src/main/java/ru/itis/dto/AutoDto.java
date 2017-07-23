package ru.itis.dto;

import ru.itis.models.Auto;

import java.util.ArrayList;
import java.util.List;

public class AutoDto {
    private int id;
    private String color;
    private String model;

    public AutoDto() {
    }

    public AutoDto(int id, String color, String model) {
        this.id = id;
        this.color = color;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static AutoDto fromModel(Auto auto) {
        return new AutoDto(auto.getId(),
                auto.getColor(),
                auto.getModel());
    }

    public static List<AutoDto> fromModels(List<Auto> autos) {
        List<AutoDto> result = new ArrayList<>();
        for (Auto auto : autos) {
            result.add(AutoDto.fromModel(auto));
        }
        return result;
    }
}
