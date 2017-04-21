import java.util.Scanner;

class Program {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter positive number less or equal 255:");
		int number = scanner.nextInt();

		int x7 = number % 2;
		int nextNum = number / 2;

		int x6 = nextNum % 2;
		nextNum /= 2;

		int x5 = nextNum % 2;
		nextNum /= 2;

		int x4 = nextNum % 2;
		nextNum /= 2;

		int x3 = nextNum % 2;
		nextNum /= 2;

		int x2 = nextNum % 2;
		nextNum /= 2;

		int x1 = nextNum % 2;
		int x0 = nextNum / 2;

		System.out.println(number + " in binary code = " + x0 + x1 + x2 + x3 + x4 + x5 + x6 + x7);
	}
}