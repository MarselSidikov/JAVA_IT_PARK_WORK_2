package ru.itpark.dao;

import ru.itpark.generators.IdGenerator;
import ru.itpark.models.Auto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AutosDaoFileBasedImpl implements AutosDao {

    private String fileName;
    private IdGenerator idGenerator;

    public AutosDaoFileBasedImpl(String fileName, IdGenerator idGenerator) {
        this.fileName = fileName;
        this.idGenerator = idGenerator;
    }

    @Override
    public int save(Auto auto) {
        try {
            BufferedWriter writer =
                    new BufferedWriter(
                            new FileWriter(fileName, true));
            int newId = idGenerator.generateForAuto();
            auto.setId(newId);
            String autoAsString = auto.getId()
                    + " " + auto.getModel()
                    + " " + auto.getColor()
                    + " " + auto.getOwnerId();
            writer.write(autoAsString + "\n");
            writer.close();
        } catch (IOException e) {
            System.err.println("Ошибки с вводом-выводом");
        }
        return 0;
    }

    @Override
    public ArrayList<Auto> findAll() {
        ArrayList<Auto> result = new ArrayList<>();
        // считываете построчно данные об автомобиле из файла
        // конвертируете в объект типа Auto
        // кладете данный объект в список
        // возвращаете список как результат
        return result;
    }
}
