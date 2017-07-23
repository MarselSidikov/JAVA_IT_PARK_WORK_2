package ru.itis.exceptions;

public class UserNotFoundException extends RuntimeException {
    public int userId;

    public UserNotFoundException(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }
}
