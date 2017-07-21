package ru.itis.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.itis.models.User;

import java.util.List;

@Component("usersDaoHibernate")
public class UsersDaoHibernateImpl implements UsersDao {

    @Autowired
    private SessionFactory sessionFactory;

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

    @Override
    public int save(User model) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(model);
        transaction.commit();
        session.close();
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
        Session session = sessionFactory.openSession();
        List<User> users =  session.createQuery("from User").list();
        session.close();
        return users;
    }
}
