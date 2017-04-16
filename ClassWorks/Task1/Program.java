import java.util.Scanner;

class Program {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt(); // 5000 * 2 + 3768
		
		int a5000 = a / 5000; // a5000 = 2
		System.out.println("5000 - " + a5000);
		a = a % 5000; // a = 3 768
		
		int a1000 = a / 1000; // a1000 = 3
		System.out.println("1000 - " + a1000);
		a = a % 1000; // a = 768
		
		// и т.д.
	}
}