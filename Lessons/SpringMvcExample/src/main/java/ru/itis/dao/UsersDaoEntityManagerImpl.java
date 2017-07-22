package ru.itis.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.itis.models.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component("usersDaoEntityManager")
public class UsersDaoEntityManagerImpl implements UsersDao{

    @PersistenceContext(name = "entityManager")
    private EntityManager entityManager;

    @Override
    public boolean isExistById(int userId) {
        return false;
    }

    @Override
    public List<User> findByName(String name) {
        return null;
    }

    @Override
    public List<User> findByAge(int age) {
        return null;
    }

    @Transactional
    @Override
    public int save(User model) {
        entityManager.persist(model);
        return model.getId();
    }

    @Override
    public User find(int id) {
        return null;
    }

    @Override
    public void update(User model) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<User> findAll() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }
}
