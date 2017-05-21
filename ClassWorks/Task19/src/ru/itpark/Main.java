package ru.itpark;

public class Main {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle("r1", 2,2);
        Rectangle r2 = new Rectangle("r2", 3,3);
        Rectangle r3 = new Rectangle("r3", 2,2);
        Square s1 = new Square("s1", 2);
        Square s2 = new Square("s2", 5);
        Square s3 = new Square("s3", 3);

        Figure figures[] = {s1, r2, s3, r1, r3, s2};
        int watches[] = new int[figures.length];
        int count = 0;
        for (int i = 0; i < figures.length - 1; i++) {
            for (int j = i + 1; j < figures.length; j++) {
                if (figures[i].equals(figures[j])
                        && (watches[i] == 0 || watches[j] == 0)) {
                    watches[i] = 1;
                    watches[j] = 1;
                    count++;
                }
            }
        }
        System.out.println(count);

        Circle c1 = new Circle("c1", 10);
        Circle c2 = new Circle("c2", 10);
        Circle c3 = new Circle("c3", 10);

        FiguresTool tool = new FiguresTool();

        Scalable scalables[] = {s1, s3, r1, r2};
        tool.scale(5, scalables);



    }
}
