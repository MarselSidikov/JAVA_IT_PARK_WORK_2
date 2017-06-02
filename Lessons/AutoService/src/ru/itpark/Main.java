package ru.itpark;

import ru.itpark.dao.AutosDao;
import ru.itpark.dao.AutosDaoFileBasedImpl;
import ru.itpark.dao.UsersDao;
import ru.itpark.dao.UsersDaoFileBasedImpl;
import ru.itpark.generators.IdGenerator;
import ru.itpark.generators.IdGeneratorImpl;
import ru.itpark.models.Auto;
import ru.itpark.services.AutoService;

public class Main {

    public static void main(String[] args) {
        IdGenerator idGenerator = new IdGeneratorImpl("auto_ids.txt");
        UsersDao usersDao = new UsersDaoFileBasedImpl("users.txt");
        AutosDao autosDao = new AutosDaoFileBasedImpl("autos.txt", idGenerator);
        AutoService autoService = new AutoService(usersDao, autosDao);
        Auto auto = new Auto("УАЗ", "Бежевый", 11);
        autoService.addAutoToUser(auto);
    }
}
