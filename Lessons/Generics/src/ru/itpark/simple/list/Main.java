package ru.itpark.simple.list;

import ru.itpark.simple.list.ArrayList;

public class Main {

    public static void main(String[] args) {
	    ArrayList list = new ArrayList();
	    list.add(6);
	    list.add(7);
	    list.add(8);

        System.out.println(list.get(2));
    }
}
