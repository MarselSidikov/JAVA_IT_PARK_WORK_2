package ru.itis.config;

import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import ru.itis.dao.UsersDao;
import ru.itis.dao.UsersDaoJdbcTemplateImpl;
import ru.itis.models.User;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@PropertySource(value = "ru.itis\\db.properties")
public class PersistenceConfig {

    @Autowired
    private Environment environment;

    @Bean
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
            sessionFactory.setDataSource(dataSource());
            sessionFactory.setAnnotatedClasses(User.class);
            Properties properties = new Properties();
            properties.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQL82Dialect");
            properties.setProperty("hibernate.show_sql", "true");
            sessionFactory.setHibernateProperties(properties);
            return sessionFactory;
    }

    // @Bean, данной аннотацией помечается метод
    // результатом выполнения которого является бин
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getProperty("db.driver"));
        dataSource.setUrl(environment.getProperty("db.url"));
        dataSource.setUsername(environment.getProperty("db.username"));
        dataSource.setPassword(environment.getProperty("db.password"));
        return dataSource;
    }
}
