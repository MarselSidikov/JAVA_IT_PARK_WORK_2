import java.util.Scanner;

class Program {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		// считали число
		int x = scanner.nextInt();
		// объявили массив
		int a[] = new int[8];
		// с конца начали его заполнять 0 и 1
		for (int i = 7; i >= 0; i--) {
			a[i] = x % 2;
			x = x/2;
		}
		System.out.println("Result:");
		for (int i = 0; i < 8; i++){
			System.out.print(a[i]);
		}	
	}
}