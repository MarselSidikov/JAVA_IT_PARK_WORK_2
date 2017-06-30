package ru.itis.template;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import ru.itis.dao.UsersDao;
import ru.itis.dao.UsersDaoJdbcTemplateImpl;
import ru.itis.models.User;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/itpark_group_2");
        dataSource.setUsername("postgres");
        dataSource.setPassword("Zaq12wsx");

        UsersDao usersDao = new UsersDaoJdbcTemplateImpl(dataSource);
        List<User> users = usersDao.findAll();

        for (User user : users) {
            System.out.println(user);
        }
    }
}
