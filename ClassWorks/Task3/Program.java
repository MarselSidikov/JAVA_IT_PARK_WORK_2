import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number:");
		int a = scanner.nextInt();
		
		if (a % 2 == 0) {
			System.out.println("EVEN");
		} else {
			System.out.println("NOT EVEN");
		}
	}
}