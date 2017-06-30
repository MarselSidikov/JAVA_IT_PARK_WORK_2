package ru.itis.dao;

import ru.itis.models.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsersDaoJdbcImpl implements UsersDao {
    //language=SQL
    private final static String SQL_SELECT_ALL_USERS =
            "SELECT * FROM human";
    //language=SQL
    private final static String SQL_SELECT_ALL_USERS_BY_AGE =
            "SELECT * FROM human WHERE age = ?";

    //language=SQL
    private final static String SQL_UPDATE_USER =
            "UPDATE human SET name = ?, age = ?, height = ? WHERE id = ?";

    //language=SQL
    private final static String SQL_INSERT_USER =
            "INSERT INTO human(name, age, height) VALUES(?, ?, ?)";

    private Connection connection;

    private static User convert(ResultSet resultSet) {
        try {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            int height = resultSet.getInt("height");
            return new User(id, name, age, height);
        } catch (SQLException e) {
            System.err.println("Ошибка выборки");
        }
        return null;
    }
    public UsersDaoJdbcImpl(Connection connection) {
        this.connection = connection;
    }

    public boolean isExistById(int userId) {
        return false;
    }

    public List<User> findByName(String name) {
        return null;
    }

    public List<User> findByAge(int age) {
        List<User> users = new ArrayList<User>();
        try {
            PreparedStatement statement = connection.prepareStatement(SQL_SELECT_ALL_USERS_BY_AGE);
            statement.setInt(1, age);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                User user = convert(resultSet);
                users.add(user);
            }
        } catch (SQLException e) {
            System.err.println("Проблемы с соединением");
            e.printStackTrace();
        }
        return users;
    }

    public int save(User model) {
        try {
            PreparedStatement statement = connection.prepareStatement(SQL_INSERT_USER, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, model.getName());
            statement.setInt(2, model.getAge());
            statement.setInt(3, model.getHeight());
            // affectedRows - количество измененных строк
            int affectedRows = statement.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("Ошибка сохранения");
            } else {
                // получаем список сгенерированных ключей запроса
                ResultSet resultSet = statement.getGeneratedKeys();
                // сдвигаем курсор на первый элемент
                resultSet.next();
                int generatedId = (int)resultSet.getLong(1);
                model.setId(generatedId);
                return generatedId;
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return -1;
    }

    public User find(int id) {
        return null;
    }

    public void update(User model) {
        try {
            PreparedStatement statement = connection.prepareStatement(SQL_UPDATE_USER);
            statement.setInt(4, model.getId());
            statement.setString(1, model.getName());
            statement.setInt(2, model.getAge());
            statement.setInt(3, model.getHeight());

            statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public void delete(int id) {

    }

    public List<User> findAll() {
        List<User> users = new ArrayList<User>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL_SELECT_ALL_USERS);
            while (resultSet.next()) {
                User user = convert(resultSet);
                users.add(user);
            }
        } catch (SQLException e) {
            System.err.println("Проблемы с соединением");
        }
        return users;
    }
}
