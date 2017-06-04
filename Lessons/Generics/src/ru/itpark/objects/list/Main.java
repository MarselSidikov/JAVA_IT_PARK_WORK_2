package ru.itpark.objects.list;

public class Main {
    public static void main(String[] args) {
        ArrayList stringsList = new ArrayList();
        String s = "Hello";
        String s1 = "Bye";
        String s2 = "Color";

        stringsList.add(s);
        stringsList.add(s1);
        stringsList.add(s2);

        String color = (String)stringsList.get(2);
        System.out.println(color);

        ArrayList integersList = new ArrayList();
        integersList.add(10);
        integersList.add(8);
        integersList.add(9);
        int nine = (int)integersList.get(2);
        System.out.println(nine);

        ArrayList humansArrayList = new ArrayList();
        Human human1 = new Human("Marsel", 23);
        Human human2 = new Human("Rinata", 21);
        humansArrayList.add(human1);
        humansArrayList.add(human2);
        Human rinata = (Human)humansArrayList.get(1);
        System.out.println(rinata.getName());

    }
}
