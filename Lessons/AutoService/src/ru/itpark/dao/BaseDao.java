package ru.itpark.dao;

import java.util.List;

public interface BaseDao<T> {
    /**
     * Метод сохранения модели
     * @param model модель для сорхранения
     * @return идентификатор модели
     */
    int save(T model);

    /**
     * Метод поиска модели по id
     * @param id идентификатор модели
     * @return модель из хранилища
     */
    T find(int id);

    /**
     * Метод обновления модели в хранилище.
     * Метод находит соответсвтующую модель
     * в хранилище, копирует данные из входного
     * параметра и сохраняет обратно в хранилище
     * @param model - обновленные данные.
     */
    void update(T model);

    void delete(int id);

    /**
     *
     * @return
     */
    List<T> findAll();

}
