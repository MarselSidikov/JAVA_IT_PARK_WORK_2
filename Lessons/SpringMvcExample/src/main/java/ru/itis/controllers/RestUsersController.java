package ru.itis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.itis.dto.AutoDto;
import ru.itis.dto.UserDto;
import ru.itis.exceptions.UserNotFoundException;
import ru.itis.models.Auto;
import ru.itis.models.User;
import ru.itis.repository.AutosRepository;
import ru.itis.repository.UsersRepository;

import java.util.List;

@RestController
public class RestUsersController {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private AutosRepository autosRepository;

    @GetMapping("/users")
    public ResponseEntity<List<UserDto>> getUsers() {
        List<User> users = usersRepository.findAll();
        List<UserDto> result = UserDto.fromModels(users);
        return ResponseEntity
                .ok(result);
    }

    @GetMapping("/autos")
    public ResponseEntity<List<AutoDto>> getAutos() {
        List<Auto> autos = autosRepository.findAll();
        List<AutoDto> result = AutoDto.fromModels(autos);
        return ResponseEntity
                .ok(result);
    }

    @GetMapping("/users/{user-id}/autos")
    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<List<AutoDto>> getAutosOfUser(
            @PathVariable("user-id") int userId) {
        boolean userIsExist = usersRepository.exists(userId);
        if (userIsExist) {
            List<Auto> autos = autosRepository.findAllByOwnerId(userId);
            List<AutoDto> result = AutoDto.fromModels(autos);
            return ResponseEntity
                    .ok(result);
        } else {
            throw new UserNotFoundException(userId);
        }
    }

    @PostMapping("/users")
    public void addUser(@RequestBody UserDto userDto) {
        User user = new User(userDto.getName(), userDto.getAge(), userDto.getHeight());
        usersRepository.save(user);
    }
}
