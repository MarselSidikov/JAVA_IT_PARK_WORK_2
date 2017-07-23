package ru.itis.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "ru.itis.repository")
@ComponentScan(value = "ru.itis")
@EntityScan(basePackages = "ru.itis.models")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
