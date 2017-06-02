package ru.itpark.dao;

import java.io.*;

public class UsersDaoFileBasedImpl implements UsersDao {

    private String fileName;

    public UsersDaoFileBasedImpl(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public boolean isExistById(int userId) {
        try {
            BufferedReader reader = new
                    BufferedReader(new FileReader(fileName));

            String currentLine = reader.readLine();
            while (currentLine != null) {
                String lineAsArray[] =
                        currentLine.split(" ");
                String userIdFromFileAsString = lineAsArray[0];
                int userIdFromFileAsInt = Integer.parseInt(userIdFromFileAsString);

                if (userId == userIdFromFileAsInt) {
                    return true;
                }
                currentLine = reader.readLine();
            }
            return false;
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден");
        } catch (IOException e) {
            System.err.println("Ошбика ввода вывода");
        }
        return false;
    }
}
