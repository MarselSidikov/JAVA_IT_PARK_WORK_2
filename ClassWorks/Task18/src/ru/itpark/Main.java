package ru.itpark;

public class Main {

    public static void main(String[] args) {
        Rectangle a = new Rectangle(4, 5);
        Square b = new Square(2);
        Trapezium c = new Trapezium(1,2,3);

        Figure figures[] = {a, b, c};

        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].area());
        }
    }
}
