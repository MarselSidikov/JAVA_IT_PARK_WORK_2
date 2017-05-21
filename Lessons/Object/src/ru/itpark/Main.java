package ru.itpark;

public class Main {

    public void removeDuplicates(Object objects[]) {
        /*
        if (objects[i].equals(objects[j]) {
        }
         */
    }
    public static void main(String[] args) {
	    Human marsel = new Human(23, "Marsel", 185);
	    Human marsel2 = new Human(23, "Marsel", 185);

        System.out.println(marsel == marsel2);
        System.out.println(marsel.equals(marsel2));

        marsel = marsel2;

        System.out.println(marsel == marsel2);

    }
}
