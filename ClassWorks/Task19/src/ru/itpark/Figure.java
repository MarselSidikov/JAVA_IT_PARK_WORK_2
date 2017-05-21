package ru.itpark;


public abstract class Figure {

    private String name;

    public Figure(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract int area();

    public abstract int perimeter();

    public boolean equals(Figure figure) {
        // Rectangle r = new Rectangle(..);
        // Square s = new Square(..);
        // boolean isEquals = r.equals(s);
        // r -> this
        // s -> figure
        return this.area() == figure.area()
                && this.perimeter() == figure.perimeter();
    }
}
