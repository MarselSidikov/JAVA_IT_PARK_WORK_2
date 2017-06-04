package ru.itpark.generics.example;

import ru.itpark.objects.list.Human;

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.put("Hello");
        //stringBox.put(12);

        Box<Integer> integerBox = new Box<>();
        integerBox.put(12);
        int value = integerBox.getThing();
        //integerBox.put("Hello");

        Box<Human> humanBox = new Box<>();
        humanBox.put(new Human("Marsel", 23));
        // humanBox.put("Hello");
    }
}
