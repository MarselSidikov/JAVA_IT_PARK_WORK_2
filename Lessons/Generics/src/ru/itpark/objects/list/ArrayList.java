package ru.itpark.objects.list;

public class ArrayList {
    private final static int MAX_SIZE = 5;

    private Object elements[];

    private int count;

    public ArrayList() {
        this.elements = new Object[MAX_SIZE];
        this.count = 0;
    }

    public void add(Object element) {
        if (count < MAX_SIZE) {
            this.elements[count] = element;
            count++;
        } else {
            System.err.println("Нет места");
        }
    }

    public   get(int index) {
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
