package ru.itpark.dao;

import ru.itpark.generators.IdGenerator;
import ru.itpark.models.Auto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

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
}
