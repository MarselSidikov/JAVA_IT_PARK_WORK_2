package ru.itpark;

public class A {
    public int aValue;
    public static int aStaticValue;

    static {
        aStaticValue = 777;
    }

    public static int sum() {
        return aStaticValue + aStaticValue;
    }


}
