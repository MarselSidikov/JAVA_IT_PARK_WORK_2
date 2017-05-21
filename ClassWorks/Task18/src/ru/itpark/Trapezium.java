package ru.itpark;

public class Trapezium extends Figure {
    int a;
    int b;
    int h;

    public Trapezium(String name, int a, int b, int h) {
        super(name);
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int area() {
        return (int)(0.5 * (a + b) * h);
    }
}
