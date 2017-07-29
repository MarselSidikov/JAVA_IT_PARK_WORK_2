package ru.itpark.services;

import ru.itpark.dto.UserDto;
import ru.itpark.dto.UserRegistrationDto;

public interface RegistrationService {
    UserDto registration(UserRegistrationDto user);
}
