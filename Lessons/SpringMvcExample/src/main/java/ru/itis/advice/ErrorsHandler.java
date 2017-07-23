package ru.itis.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import ru.itis.dto.ExceptionDto;
import ru.itis.exceptions.UserNotFoundException;

@ControllerAdvice
public class ErrorsHandler {
    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    ExceptionDto handleException(UserNotFoundException exception){
        return new ExceptionDto("User" + exception.getUserId() + " not found");
    }

}
