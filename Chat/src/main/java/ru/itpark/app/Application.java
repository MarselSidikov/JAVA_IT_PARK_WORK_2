package ru.itpark.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ru.itpark.models.Token;
import ru.itpark.models.User;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "ru.itpark.repository")
@EntityScan(basePackageClasses = {User.class, Token.class,
        Application.class, Jsr310JpaConverters.class})
@ComponentScan(value = "ru.itpark")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
