package ru.itpark.dao;

import ru.itpark.models.Auto;

import java.util.ArrayList;

public interface AutosDao {
    int save(Auto auto);
    ArrayList<Auto> findAll();
}
