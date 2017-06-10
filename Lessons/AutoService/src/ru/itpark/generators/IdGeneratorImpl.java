package ru.itpark.generators;

import java.io.*;

public class IdGeneratorImpl implements IdGenerator {

    private int lastAutoId;

    private String autoIdFileName;

    public IdGeneratorImpl(String autoIdFileName) {
        this.autoIdFileName = autoIdFileName;
        try {
            BufferedReader autoReader =
                    new BufferedReader(
                            new FileReader(autoIdFileName));
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
        int newId = lastAutoId + 1;
        try {
            BufferedWriter autoWriter =
                    new BufferedWriter(
                            new FileWriter(autoIdFileName));
            autoWriter.write(newId + "");
            autoWriter.close();
			lastAutoId = newId;
        } catch (IOException e) {
            System.err.println("Проблемы с вводом выводом");
        }
        return newId;
    }
}
