package ru.itpark.services;

import ru.itpark.dto.UserDto;
import ru.itpark.dto.UserRegistrationDto;
import ru.itpark.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ru.itpark.repository.UsersRepository;

// аннотация Service синоним аннотации Component
// она позволяет спрингу поместить экзепляр класса
// RegistrationServiceImpl в поле класса-контроллера
@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private UsersRepository usersRepository;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @Override
    public UserDto registration(UserRegistrationDto user) {
        // 1. Хешировать пароль
        String hashPassword = encoder.encode(user.getPassword());
        // 2. Сохранить в БД
        User model = new User(user.getName(), user.getLogin(), hashPassword);
        usersRepository.save(model);
        // 3. Получить id и имя и вернуть как результат
        return new UserDto(model.getId(), model.getName());
    }
}
