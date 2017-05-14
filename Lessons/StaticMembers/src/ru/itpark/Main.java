package ru.itpark;

public class Main {

    public static void main(String[] args) {
        System.out.println(A.aStaticValue);
        A.aStaticValue = 999;
	    A a1 = new A();
	    a1.aValue = 10;
	    A a2 = new A();
	    a2.aValue = 20;

        System.out.println(a1.aStaticValue);
        System.out.println(a2.aStaticValue);

        System.out.println(a1.aValue);
        System.out.println(a2.aValue);

        a1.aStaticValue = 100;
        a2.aStaticValue = 50;

        System.out.println(a1.aStaticValue);
        System.out.println(a2.aStaticValue);

        A.aStaticValue = 500;

        System.out.println(a1.aStaticValue);
        System.out.println(a2.aStaticValue);
        System.out.println(Math.PI);
        Math.sin(10);
        Math.cos(10);
    }
}
