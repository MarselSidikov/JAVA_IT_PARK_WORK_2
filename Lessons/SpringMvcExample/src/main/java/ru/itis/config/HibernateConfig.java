package ru.itis.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import ru.itis.models.Auto;
import ru.itis.models.User;

import javax.sql.DataSource;
import java.util.Properties;

//@Configuration
public class HibernateConfig {

    @Autowired
    @Qualifier("itpark_db")
    private DataSource dataSource;

    // Фабрика сессий
    @Bean
    public LocalSessionFactoryBean sessionFactory() {
        // создаем объект-фабрику сессий
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        // подключили к базе данных
        sessionFactory.setDataSource(dataSource);

        sessionFactory.setAnnotatedClasses(User.class, Auto.class);
        Properties properties = new Properties();
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQL82Dialect");
        properties.setProperty("hibernate.show_sql", "true");
        sessionFactory.setHibernateProperties(properties);
        return sessionFactory;
    }
}
