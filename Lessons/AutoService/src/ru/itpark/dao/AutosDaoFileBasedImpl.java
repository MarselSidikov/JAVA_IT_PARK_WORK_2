package ru.itpark.dao;

import ru.itpark.generators.IdGenerator;
import ru.itpark.mappers.RowMapper;
import ru.itpark.models.Auto;
import ru.itpark.utils.FileDaoTemplate;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AutosDaoFileBasedImpl implements AutosDao {

    private String fileName;
    private IdGenerator idGenerator;
    private FileDaoTemplate template;

    public AutosDaoFileBasedImpl(String fileName, IdGenerator idGenerator, FileDaoTemplate template) {
        this.fileName = fileName;
        this.idGenerator = idGenerator;
        this.template = template;
    }

    @Override
    public int save(Auto auto) {
        try {
            // открываем файл с машинами для записи
            BufferedWriter writer =
                    new BufferedWriter(
                            new FileWriter(fileName, true));
            // генерируем id для машины
            int newId = idGenerator.generateForAuto();
            // проставляем машине id
            auto.setId(newId);
            // подготовили строку с данными о машине
            String autoAsString = auto.getId()
                    + " " + auto.getModel()
                    + " " + auto.getColor()
                    + " " + auto.getOwnerId();
            // записали строку в файл, в конце поставили переход на новую строку
            writer.write(autoAsString + "\n");
            // закрыли файл
            writer.close();
        } catch (IOException e) {
            System.err.println("Ошибки с вводом-выводом");
        }
        return 0;
    }

    private RowMapper<Auto> autoRowMapper = new RowMapper<Auto>() {
        @Override
        public Auto mapRow(String row) {
            String data[] = row.split(" ");
            return new Auto(
                    Integer.parseInt(data[0]),
                    data[1],
                    data[2],
                    Integer.parseInt(data[3]));
        }
    };
    @Override
    public Auto find(int id) {
        return template.findByValue(fileName, 0, id, autoRowMapper).get(0);
    }

    @Override
    public void update(Auto model) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Auto> findAll() {
        return null;
    }

}
