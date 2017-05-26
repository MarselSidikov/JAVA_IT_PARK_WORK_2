package ru.itpark.serialization;


import java.io.*;

public class MainSer {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream outputStream =
                new ObjectOutputStream(new FileOutputStream("human.ser"));
        Human human = new Human(23,
                "Marsel",
                "Kolhozabad");

        outputStream.writeObject(human);

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("human.ser"));
        Human deserializedHuman = (Human)inputStream.readObject();
        int i = 0;
    }
}
