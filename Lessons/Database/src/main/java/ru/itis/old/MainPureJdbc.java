package ru.itis.old;

import java.sql.*;
import java.util.Scanner;

public class MainPureJdbc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        // интерфейс для создания подключения к БД
        String databaseUrl = "jdbc:postgresql://localhost:5432/itpark_group_2";
        String databaseUsername = "postgres";
        String databasePassword = "Zaq12wsx";
        try {
            // создаем подключение к БД
            Connection connection =
                    DriverManager
                            .getConnection(databaseUrl, databaseUsername, databasePassword);
            // statement - выражение, которое может содержать
            // запрос и передавать его в бд с получением резульата
            //Statement statement = connection.createStatement();
            // resultSet
            /*
            resultSet ->
                        - Антон
                        - Рустем
                        - Елена
                        - Валерий
            next()
            resultSet -> - Антон
                        - Рустем
                        - Елена
                        - Валерий
             */
            //ResultSet resultSet = statement.executeQuery("SELECT * FROM human WHERE age > " + age);
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM human WHERE age > ?");
            statement.setInt(1, age);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                // вытаскиваем из resultSet столбец name
                System.out.println(resultSet.getString("name") +
                resultSet.getInt("age"));
            }

            statement = connection.prepareStatement("INSERT INTO human(name, age, height) VALUES(?, ?, ?)");
            statement.setString(1, "Alina");
            statement.setInt(2, 18);
            statement.setInt(3, 160);
            statement.execute();
        } catch (SQLException e) {
            System.err.println("Ошибка подключения");
            e.printStackTrace();
        }
    }
}
