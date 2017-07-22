package ru.itis.config;

import org.omg.PortableInterceptor.USER_EXCEPTION;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import ru.itis.dao.UsersDaoHibernateImpl;
import ru.itis.models.Auto;
import ru.itis.models.User;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
public class TestConfig {

    @Bean
    public UsersDaoHibernateImpl usersDaoHibernate() {
        return new UsersDaoHibernateImpl();
    }

    @Bean
    public LocalSessionFactoryBean sessionFactory() {
        // создаем объект-фабрику сессий
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        // подключили к базе данных
        sessionFactory.setDataSource(dataSource());

        sessionFactory.setAnnotatedClasses(Auto.class, User.class);
        Properties properties = new Properties();
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.HSQLDialect");
        properties.setProperty("hibernate.show_sql", "true");
        sessionFactory.setHibernateProperties(properties);
        return sessionFactory;
    }

    @Bean
    public DataSource dataSource() {
        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
        return builder
                .setType(EmbeddedDatabaseType.HSQL)
                .addScript("ru.itis\\human_schema.sql")
                .addScript("ru.itis\\human_data.sql")
                .addScript("ru.itis\\auto_schema.sql")
                .addScript("ru.itis\\auto_data.sql")
                .build();
    }
}
