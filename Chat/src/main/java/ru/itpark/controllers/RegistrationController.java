package ru.itpark.controllers;

import ru.itpark.dto.UserDto;
import ru.itpark.dto.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.itpark.services.RegistrationService;

// Контроллер - объекты классов-контроллеров
// принимают http-запросы и соответствующе обрабатывают их
// Чтобы дать понять Spring-у, что у нас класс-контроллер
// мы ставим аннотацию @Controller
// но, если нам надо, чтобы контроллер принимал на вход
// JSON-объекты и возвращал JSON-объекты
// мы ставим аннотацию @RestController
@RestController
public class RegistrationController {

    // классы сервисов обычно содержат логику приложений
    // таким образом, классы-контроллеры - это
    // всегда обертки над сервисами, то есть
    // методы контроллеров просто делегируют выполнение
    // задачи на сервис

    // для этого мы предусмотрели в контроллере
    // поле типа RegistrationService
    // Spring получив на вход аннотацию @Autowired
    // сам определит, какой сервис подходит в это поле
    @Autowired
    private RegistrationService service;

    // данная аннотация указывает, что этот
    // метод будет обрабатывать запрос
    // POST /users
    @PostMapping("/users")
    public ResponseEntity<UserDto>
    registration(@RequestBody UserRegistrationDto user) {
        // передаем задачу регистрации пользователя
        // соответствующему сервису
        // получаем результат регистрации и возвращаем
        // клиентскому приложению ответ
        UserDto resultUser = service.registration(user);
        return ResponseEntity
                .ok(resultUser);
    }
}
