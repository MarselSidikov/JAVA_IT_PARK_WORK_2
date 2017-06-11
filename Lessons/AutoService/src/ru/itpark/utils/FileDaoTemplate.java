package ru.itpark.utils;

import ru.itpark.mappers.RowMapper;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileDaoTemplate {

    /**
     * Получение сущности из файла, которая обладает заданным параметром
     * @param fileName имя файла, откуда нужно достать сущность
     * @param valueColumn колонка, в которой следует искать параметр
     * @param value значение, которое мы ищем
     * @param <T> тип модели
     * @return найденную модель
     */
    public <T> List<T> findByValue(String fileName, int valueColumn, Object value, RowMapper<T> rowMapper) {
        List<T> result = new ArrayList<>();
        try {
            // открыли файл для чтения
            BufferedReader reader = new BufferedReader(
                    new FileReader(fileName));
            // считали текущую строку
            String currentLine = reader.readLine();

            // если текущая строка не нулевая
            while (currentLine != null) {
                // разбиваем ее на пробелы
                String data[] = currentLine.split(" ");
                // получем интересующее нас значение
                String interestingValue = data[valueColumn];
                // конвертируем входное значение в строку
                String inputValue = value.toString();
                // сравниваем две строки
                if (interestingValue.equals(inputValue)) {
                    // если совпали - преобразуем строку в объект с помощью rowMapper
                    T founded = rowMapper.mapRow(currentLine);
                    // кладем в список
                    result.add(founded);
                }
                // если не совпали, идем дальше
                currentLine = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
