package ru.itpark.generators;

public interface IdGenerator {
    // сгенерировать идентифкатор для пользователя
    int generateForUser();
    // сгенировать идентификатор для машины
    int generateForAuto();
}
