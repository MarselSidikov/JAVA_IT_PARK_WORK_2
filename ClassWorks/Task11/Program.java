class Program {
	public static void main(String args[]) {
		int a[] = {4, 5, 6, 2, 3};
		
		int x = 0;
		int y = 1;
		for (int i = 4; i >= 0; i--) {
			x = x + a[i] * y;
			y = y * 10;
		}
		
		// x = 0 + 3 * 1
		// x = 3 + 2 * 10
		// x = 23 + 6 * 100
		// x = 623 + 5 * 1000
		// x = 5623 + 4 * 10000
		// x = 45 623
	}
}