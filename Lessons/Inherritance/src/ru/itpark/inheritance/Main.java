package ru.itpark.inheritance;

// Проблема - дублилование кода Car в SportCar
public class Main {

    public static void main(String[] args) {
	    Car camry = new Car("Camry", 4,
                "Green", 120);

		Car landRover = new Car("Range Rover", 3,
				"White", 150);

	    SportCar bugatti = new SportCar("Veyron", 8,
                "Blue", 410, 1.3);

		SportCar audi = new SportCar("R8", 8,
				"Red", 390, 1.2);

	    Batmobile batmobile = new Batmobile("I'm A Batman", 10,
				"Black",500, 2 );

	    // Car car = new Batmobile("I'm A Batman", 10,
		// "Black",500, 2 ); - восходящее преобразование
	    Car cars[] = {camry, bugatti, audi, landRover, batmobile};

		for (int i = 0; i < cars.length; i++) {
			Car currentCar = cars[i];
			currentCar.go();
		}
    }
}
