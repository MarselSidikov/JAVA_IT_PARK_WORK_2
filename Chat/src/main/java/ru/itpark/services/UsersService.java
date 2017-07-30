package ru.itpark.services;

import ru.itpark.dto.UserDto;
import ru.itpark.dto.UserRegistrationDto;

public interface UsersService {
    UserDto registration(UserRegistrationDto user);

    String login(String login, String password);
}
