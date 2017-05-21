package ru.itpark;


public class Rectangle extends Figure implements Scalable {
    private int b;
    private int a;

    public Rectangle(String name, int a, int b) {
        super(name);
        this.a = a;
        this.b = b;
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

    public int area() {
        return a * b;
    }

    @Override
    public int perimeter() {
        return a * 2 + b * 2;
    }

    @Override
    public void scale(int koeff) {
        this.a = a * koeff;
        this.b = b * koeff;
    }
}
