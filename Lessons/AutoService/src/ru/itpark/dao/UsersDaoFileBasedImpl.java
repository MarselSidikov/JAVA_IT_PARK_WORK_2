package ru.itpark.dao;

import ru.itpark.mappers.RowMapper;
import ru.itpark.models.User;
import ru.itpark.utils.FileDaoTemplate;

import java.io.*;
import java.util.List;

public class UsersDaoFileBasedImpl implements UsersDao {

    private String fileName;

    // поле - шаблон, для работы с файлами
    private FileDaoTemplate template;

    public UsersDaoFileBasedImpl(String fileName, FileDaoTemplate template) {
        this.fileName = fileName;
        this.template = template;
    }

    // вложенный анонимный класс
    // реализация RowMapper с конкретным типом User
    // здесь мы определили, как строка будет
    // преобразовываться в объект
    private RowMapper<User> userRowMapper = new RowMapper<User>() {
        @Override
        public User mapRow(String row) {
            String data[] = row.split(" ");
            return new User(
                    Integer.parseInt(data[0]),
                    data[1],
                    Integer.parseInt(data[2]));
        }
    };

    @Override
    public boolean isExistById(int userId) {
        try {
            // открыли файл для чтения
            BufferedReader reader = new
                    BufferedReader(new FileReader(fileName));
            // считали строку из файла
            String currentLine = reader.readLine();
            // пока считываемая строка не пустая
            while (currentLine != null) {
                // расбиваем строку по пробелам на массив строк
                String lineAsArray[] =
                        currentLine.split(" ");
                // получаем идентификатор пользователя
                String userIdFromFileAsString = lineAsArray[0];
                // преобразуем его в число
                int userIdFromFileAsInt = Integer.parseInt(userIdFromFileAsString);
                // стравниваем текщуий id с тем, что подали нам на вход
                if (userId == userIdFromFileAsInt) {
                    // если совпали - возвращаем результат
                    return true;
                }
                // если не совпало, считываем новую строку
                currentLine = reader.readLine();
            }
            // если в цикле ни разу не нашли id, возвращаем - нет
            return false;
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден");
        } catch (IOException e) {
            System.err.println("Ошбика ввода вывода");
        }
        return false;
    }

    // метод поиска по имени
    @Override
    public List<User> findByName(String name) {
        return template.findByValue(fileName, 1, name, userRowMapper);
    }

    @Override
    public List<User> findByAge(int age) {
        return template.findByValue(fileName, 2, age, userRowMapper);
    }

    @Override
    public int save(User model) {
        return 0;
    }

    @Override
    public User find(int id) {
        return template.findByValue(fileName, 0, id, userRowMapper).get(0);
    }

    @Override
    public void update(User model) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
