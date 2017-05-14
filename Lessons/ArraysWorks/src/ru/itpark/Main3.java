package ru.itpark;


public class Main3 {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.addToBegin(5);
        a.addToBegin(7);

        ArrayList b = new ArrayList();
        b.addToBegin(10);
        b.addToBegin(11);

        ArrayList c = ArrayList.concat(a,  b);

        for (int i = 0; i < c.getCount(); i++) {
            System.out.println(c.get(i));
        }
    }
}
