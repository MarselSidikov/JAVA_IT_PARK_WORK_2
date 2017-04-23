import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = 
					new Scanner(System.in);

		int number;
		int sum = 0;
		int i = 0;

		while (i < 10) {
			number = scanner.nextInt();
			if (number % 2 == 0) {
				sum = sum + number;
			}
			i++;
		}
		System.out.println(sum);
	}
}