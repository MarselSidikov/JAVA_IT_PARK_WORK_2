package ru.itpark;

public class PersonDataVerifier {
    public void verifyName(String name) throws IncorrectNameOrSurnameException {
        if (!Character.isUpperCase(name.charAt(0))) {
            throw new IncorrectNameOrSurnameException();
        }
    }
}
