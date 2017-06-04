package ru.itpark.generics.example;

public class Box<T> {
    private T thing;

    public void put(T myThing) {
        thing = myThing;
    }

    public T getThing() {
        return thing;
    }
}
