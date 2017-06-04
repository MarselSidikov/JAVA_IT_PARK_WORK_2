package ru.itpark.generics.list;

import ru.itpark.objects.list.Human;

public class Main {
    public static void main(String[] args) {
        ArrayList<Human> humanArrayList = new ArrayList<>();
        humanArrayList.add(new Human("Marsel", 23));
        humanArrayList.add(new Human("Rinata", 21));
        // humanArrayList.add("Hello");
    }
}
