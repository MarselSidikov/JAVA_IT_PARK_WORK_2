package ru.itpark;


public class MainWithArrayList {
    public static void main(String[] args) {
        ArrayList animalsWeight = new ArrayList();

        animalsWeight.addToEnd(13);
        animalsWeight.addToEnd(15);
        animalsWeight.addToEnd(11);
        animalsWeight.addToEnd( 8);
        animalsWeight.addToEnd(9);
        animalsWeight.addToBegin(100);
        animalsWeight.addToEnd(777);
        animalsWeight.addToIndex(66, 3);
        animalsWeight.removeByIndex(3);
        animalsWeight.removeByValue(100);

        for (int i = 0; i < animalsWeight.getCount(); i++) {
            System.out.println(animalsWeight.get(i));
        }

        ArrayList humansAges = new ArrayList();
        humansAges.addToBegin(23);
        humansAges.addToBegin(25);
        humansAges.addToBegin(33);
    }
}
