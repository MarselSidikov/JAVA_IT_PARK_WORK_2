package ru.itis.dao;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.itis.config.PersistenceConfig;
import ru.itis.config.TestConfig;
import ru.itis.models.User;

import java.util.List;

import static org.junit.Assert.assertEquals;

// Модульный тест - автоматически проверяет функциональность
// какого либо класса

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class)
public class UsersDaoHibernateImplTest {

    private static User userIvan = new User(3, "Иван", 23, 186);

    // то, что мы хотим протестировать
    @Autowired
    @Qualifier("usersDaoHibernate")
    private UsersDaoHibernateImpl usersDao;
    // @Before - говорит о том, что метод
    // помеченный данной аннотацией будет
    // запускаться самым первым
    // и перед каждым тестом
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void find() throws Exception {
        // объект, который мы получили
        User actual = usersDao.find(3);
        // ожидаемый
        User expected = userIvan;
        assertEquals(expected, actual);
    }

    @Test
    public void update() throws Exception {
        userIvan.setAge(24);
        usersDao.update(userIvan);
        User actual = usersDao.find(3);
        User expected = userIvan;
        assertEquals(expected, actual);
    }



}