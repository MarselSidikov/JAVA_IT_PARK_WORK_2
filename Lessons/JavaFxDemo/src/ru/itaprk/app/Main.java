package ru.itaprk.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// Main - класс, который содержит входную точку
// приложения
// Main является потомком класса Application
// это класс JavaFX
// данный класс содержит метод launch - запуск приложения
// именно данный метод вызывается внутри main-процедуры
public class Main extends Application {

    // метод, срабатывающий при запуске приложения
    @Override
    public void start(Stage primaryStage) throws Exception{
        // загружается файл со fxml-окном
        Parent root = FXMLLoader.load(getClass().getResource("../main.fxml"));
        primaryStage.setTitle("Hello World");
        // создаем сцену и засовываем ее в стейдж
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
