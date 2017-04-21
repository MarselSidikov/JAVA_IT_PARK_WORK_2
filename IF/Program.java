import java.util.Scanner;
class Program {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		// если a больше b
		if (a > b) {
			// выводим максимальное - а
			System.out.println("MAX: " + a);
		} 
		// иначе если а меньше b
		else if (a < b) {
			// выводим максимальное b
			System.out.println("MAX: " + b);
		}
		// иначе если оба верхних условия не истинны
		else {
			// получается, что а и b равны
			System.out.println("They are equals");
		}
	}
}