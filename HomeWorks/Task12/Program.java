import java.util.Scanner;

class Program {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number of numbers: ");
		// количество элементов в последовательности
		int count = scanner.nextInt();
		// количество локальных максимумов
		int countMax = 0;
		// номер текущего числа + счетчик
		int i = 0;
		// текущий
		int curr = 0;
		// предыдущий
		int prev = 0;
		// предыдущий предыдущего
		int prevPrev = 0;

		while (i < count) {
			System.out.print("Enter next number: ");
			// считали текущее число
			curr = scanner.nextInt();

			if (i > 1 && prev > prevPrev && prev > curr) {
				countMax++;
			}
			
			prevPrev = prev;
			prev = curr;
			i++;
		}

		System.out.println("Number of local max = " + countMax);
	}
}