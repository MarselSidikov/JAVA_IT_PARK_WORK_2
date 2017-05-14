package ru.itpark;

public class Rectangle {
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public Rectangle(int a, int b) {
        this.setA(a);
        this.setB(b);
    }

    public void setA(int a) {
        if (a > 0) {
            this.a = a;
        } else {
            this.a = 1;
        }
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        if (b > 0) {
            this.b = b;
        } else {
            this.b = 1;
        }
    }

    public int area() {
        return a * b;
    }
}
