package ru.itpark.generators;

import java.io.*;

public class IdGeneratorImpl implements IdGenerator {

    // последний сгенерированный id для машины
    private int lastAutoId;
    // файл со сгенерированным id
    private String autoIdFileName;

    public IdGeneratorImpl(String autoIdFileName) {
        this.autoIdFileName = autoIdFileName;
        try {
            BufferedReader autoReader =
                    new BufferedReader(
                            new FileReader(autoIdFileName));
            // как только объект класса создается
            // мы сразу считываем последний сгенерированный id
            lastAutoId = Integer.parseInt(autoReader.readLine());
        } catch (IOException e) {
            System.err.println("Проблемы с вводом выводом");
        }
    }

    @Override
    public int generateForUser() {
        return 0;
    }

    @Override
    public int generateForAuto() {
        // создаем новый id, путем увеличения id предыдущего
        int newId = lastAutoId + 1;
        try {
            BufferedWriter autoWriter =
                    new BufferedWriter(
                            new FileWriter(autoIdFileName));
            // сразу записываем в файл
            autoWriter.write(newId + "");
            // закрыли файл
            autoWriter.close();
            // теперь последний сгенерированный id - новый id
			lastAutoId = newId;
        } catch (IOException e) {
            System.err.println("Проблемы с вводом выводом");
        }
        // возвращаем новый id
        return newId;
    }
}
