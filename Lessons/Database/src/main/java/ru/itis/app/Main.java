package ru.itis.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.itis.dao.UsersDao;
import ru.itis.models.User;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("ru.itis\\context.xml");

        UsersDao usersDao = context.getBean(UsersDao.class);
        List<User> users = usersDao.findAll();

        User alina = new User("Алина", 18, 160);
        System.out.println(usersDao.save(alina));
        for (User user : users) {
            System.out.println(user);
        }
//
//        User updatedMarsel = new User(1, "Марсель",34, 189);
//        usersDao.update(updatedMarsel);
//
//        User regina = usersDao.find(13);
//
//        System.out.println(regina);
//
//        System.out.println(usersDao.isExistById(14));
//        System.out.println(usersDao.isExistById(50));
    }
}
