package ru.itpark.problem;

// Проблема - дублилование кода Car в SportCar
public class Main {

    public static void main(String[] args) {
	    Car camry = new Car("Camry", 4,
                "Green", 120);

	    SportCar bugatti = new SportCar("Veyron", 8,
                "Black", 410, 1.3);

	    camry.go();
	    bugatti.go();
    }
}
