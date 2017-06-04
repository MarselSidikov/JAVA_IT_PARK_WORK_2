package ru.itpark.simple.list;

public class ArrayList {
    private final static int MAX_SIZE = 5;

    private int elements[];

    private int count;

    public ArrayList() {
        this.elements = new int[MAX_SIZE];
        this.count = 0;
    }

    public void add(int element) {
        if (count < MAX_SIZE) {
            this.elements[count] = element;
            count++;
        } else {
            System.err.println("Нет места");
        }
    }

    public int get(int index) {
        if (index < count) {
            return this.elements[index];
        } else {
            System.err.println("Неверный индекс");
            return -1;
        }
    }

    public int getCount() {
        return count;
    }
}
