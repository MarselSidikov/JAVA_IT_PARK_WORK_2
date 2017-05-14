package ru.itpark;

public class Main {

    public static void main(String[] args) {
	    Rectangle r1 = new Rectangle(3, 3);
	    Rectangle r2 = new Rectangle(1, 5);
	    Rectangle r3 = new Rectangle(9, 2);
	    Rectangle r4 = new Rectangle(1, 1);

	    Rectangle rectangles[] = {r1, r2, r3, r4};

	    for (int i = rectangles.length - 1; i >= 0; i--) {
	        for (int j = 0; j < i; j++) {
	            if (rectangles[j].area() > rectangles[j+1].area()) {
	                Rectangle temp = rectangles[j];
	                rectangles[j] = rectangles[j+1];
	                rectangles[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < rectangles.length; i++) {
            System.out.println(rectangles[i].getA() +
            " " + rectangles[i].getB() + ", area=" + rectangles[i].area());
        }
    }
}
