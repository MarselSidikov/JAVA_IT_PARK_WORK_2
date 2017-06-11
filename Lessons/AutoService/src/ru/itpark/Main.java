package ru.itpark;

import ru.itpark.dao.AutosDao;
import ru.itpark.dao.AutosDaoFileBasedImpl;
import ru.itpark.dao.UsersDao;
import ru.itpark.dao.UsersDaoFileBasedImpl;
import ru.itpark.generators.IdGenerator;
import ru.itpark.generators.IdGeneratorImpl;
import ru.itpark.models.Auto;
import ru.itpark.models.User;
import ru.itpark.services.AutoService;
import ru.itpark.utils.FileDaoTemplate;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        FileDaoTemplate template = new FileDaoTemplate();
        UsersDao usersDao = new UsersDaoFileBasedImpl("users.txt", template);
        AutosDao autosDao = new AutosDaoFileBasedImpl("autos.txt", null, template);
        User user = usersDao.find(4);
        System.out.println(user.getName());
        Auto auto = autosDao.find(8);
        System.out.println(auto.getColor());
        List<User> users = usersDao.findByAge(23);
        System.out.println(users);
    }
}
