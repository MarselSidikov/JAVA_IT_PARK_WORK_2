package ru.itpark.generics.list;

public class ArrayList<T> {
    private final static int MAX_SIZE = 5;

    private Object elements[];

    private int count;

    public ArrayList() {
        this.elements = new Object[MAX_SIZE];
        this.count = 0;
    }

    public void add(T element) {
        if (count < MAX_SIZE) {
            this.elements[count] = element;
            count++;
        } else {
            System.err.println("Нет места");
        }
    }

    public T get(int index) {
        if (index < count) {
            return (T)this.elements[index];
        } else {
            System.err.println("Неверный индекс");
            return null;
        }
    }

    public int getCount() {
        return count;
    }
}
