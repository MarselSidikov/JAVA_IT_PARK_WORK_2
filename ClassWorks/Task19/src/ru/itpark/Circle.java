package ru.itpark;

public class Circle extends Figure {

    private int r;

    public Circle(String name, int r) {
        super(name);
        this.r = r;
    }

    public int getR() {
        return r;
    }

    @Override
    public int area() {
        return (int)Math.PI * r * r;
    }

    @Override
    public int perimeter() {
        return (int)(2 * Math.PI * r);
    }
}
