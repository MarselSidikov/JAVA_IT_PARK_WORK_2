package ru.itpark.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Human human = new Human(23,
                "Marsel",
                "Kolhozabad");

        OutputStream outputStream = new FileOutputStream("human.txt");
        outputStream.write(human.getName().getBytes());
        outputStream.write(' ');
        outputStream.write(human.getBornCity().getBytes());
        outputStream.write(' ');
        String ageAsString = String.valueOf(human.getAge());
        outputStream.write(ageAsString.getBytes());

        InputStream inputStream = new FileInputStream("human.txt");
        Scanner scanner = new Scanner(inputStream);
        String name = scanner.next();
        String bornCity = scanner.next();
        int age = scanner.nextInt();

        Human humanFromFile = new Human(age, name, bornCity);
        int i = 0;
    }
}
