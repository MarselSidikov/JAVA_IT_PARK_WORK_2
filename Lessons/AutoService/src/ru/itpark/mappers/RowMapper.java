package ru.itpark.mappers;

public interface RowMapper<T> {
    /**
     * Конвертирует строку в объект по какому-либо правилу
     * @param row входная строка
     * @return сконвертированный объект
     */
    T mapRow(String row);
}
