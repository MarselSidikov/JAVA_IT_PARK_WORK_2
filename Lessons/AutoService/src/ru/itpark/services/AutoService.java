package ru.itpark.services;

import ru.itpark.dao.AutosDao;
import ru.itpark.dao.UsersDao;
import ru.itpark.models.Auto;

public class AutoService {

    private UsersDao usersDao;
    private AutosDao autosDao;

    public AutoService(UsersDao usersDao, AutosDao autosDao) {
        this.usersDao = usersDao;
        this.autosDao = autosDao;
    }

    public void addAutoToUser(Auto auto) {
        int userId = auto.getOwnerId();
        if (usersDao.isExistById(userId)) {
            autosDao.save(auto);
        } else {
            System.err.println("Пользователь не найден");
        }
    }
}
