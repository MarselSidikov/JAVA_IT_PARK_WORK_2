package ru.itpark;

public class Main {
    /**
     * Переменная глобальная для addToEndOfArray
     * и для main
     */
    public static int count = 0;
    /**
     * Процедура добавления элемента в массив
     * @param a - массив, куда надо добавить элемент
     * @param value - значение, которое нужно добавить
     */
    public static void addToEndOfArray(int a[], int value) {
       addToIndexOfArray(a, value, count);
    }

    /**
     * Кладет значение в начало массива
     * @param a
     * @param value
     */
    public static void addToBeginOfArray(int a[], int value) {
        addToIndexOfArray(a, value, 0);
    }

    public static void addToIndexOfArray(int a[], int value, int index) {
        // делаем свдиг вправо, начиная с конца (count)
        // пока не дойдем до индекса, куда ходим добавить элемент
        for (int i = count; i > index; i--) {
            a[i] = a[i - 1];
        }
        // добавляем значение в нужный индекс
        a[index] = value;
        count++;
    }

    public static void removeByIndex(int a[], int index) {
        // делаем сдвиг влево, начиная от элемента, который хотим удалить
        for (int i = index; i < count -1; i++) {
            a[i] = a[i + 1];
        }
        // уменьшаем количество элементов
        count--;
    }

    public static void removeByValue(int a[], int value) {
        // получили индекс удаляемого элемента
        int indexOfRemoved = indexOf(a, value);
        // удалили по индексу
        removeByIndex(a, indexOfRemoved);
    }

    public static int indexOf(int a[], int value) {
        for (int i = 0; i < count; i++) {
            if (a[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void bubleSort(int a[]) {
        // TODO: реализовать
    }
    public static void main(String[] args) {
        int animalsWeight[] = new int[10];
        /*
        animalsWeight[0] = 13;
        animalsWeight[1] = 15;
        animalsWeight[2] = 11;
        animalsWeight[3] = 8;
        animalsWeight[4] = 9;
        */
        addToEndOfArray(animalsWeight, 13);
        addToEndOfArray(animalsWeight, 15);
        addToEndOfArray(animalsWeight, 11);
        addToEndOfArray(animalsWeight, 8);
        addToEndOfArray(animalsWeight, 9);
        addToBeginOfArray(animalsWeight, 100);
        addToEndOfArray(animalsWeight, 777);
        addToIndexOfArray(animalsWeight, 66, 3);
        removeByIndex(animalsWeight, 3);
        removeByValue(animalsWeight, 100);
        for (int i = 0; i < count; i++) {
            System.out.println(animalsWeight[i]);
        }


    }
}
