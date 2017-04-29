import java.util.Scanner;
class Program {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a[] = new int[5];
		
		int i = 0;
		
		while (i < 5) {
			a[i] = scanner.nextInt();
			i++;
		}
		
		// i == 5
		/**
			a[0] = scanner.nextInt();
			a[1] = scanner.nextInt();
			a[2] = scanner.nextInt();
			a[3] = scanner.nextInt();
			a[4] = scanner.nextInt();
		**/
		
		i = 4;
		while (i >= 0) {
			System.out.println(a[i]);
			i--;
		}
		
	}
}