package ru.itis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("ru.itis\\context.xml");
        MessageRenderer renderer = context.getBean("renderer", MessageRenderer.class);
        renderer.showMessage();
    }
}