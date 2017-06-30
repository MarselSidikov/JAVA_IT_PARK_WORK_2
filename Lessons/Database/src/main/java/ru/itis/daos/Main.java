package ru.itis.daos;

import ru.itis.dao.UsersDao;
import ru.itis.dao.UsersDaoJdbcImpl;
import ru.itis.models.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String databaseUrl = "jdbc:postgresql://localhost:5432/itpark_group_2";
        String databaseUsername = "postgres";
        String databasePassword = "Zaq12wsx";
        try {
            Connection connection =
                    DriverManager
                            .getConnection(databaseUrl, databaseUsername, databasePassword);
            UsersDao usersDao = new UsersDaoJdbcImpl(connection);
            List<User> users = usersDao.findByAge(30);

            for (User user : users) {
                System.out.println(user);
            }

            User user = new User(2, "Антон",30, 195);
            usersDao.update(user);

            User regina = new User("Регина", 19, 160);

            int id = usersDao.save(regina);
            System.out.println(id);
            System.out.println(regina);

        } catch (SQLException e) {
            System.err.println("Ошибка подключения");
        }
    }
}
