import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int i = 2;
		int x = scanner.nextInt();
		boolean isPrime = true;

		while (i * i <= x) {
			if (x % i == 0) {
				isPrime = false;
				break; // stop while
			} 
			i = i + 1; // i++;
		}

		if (isPrime) {
			System.out.println("PRIME")
		} else {
			System.out.println("NOT PRIME");
		}

	}
}