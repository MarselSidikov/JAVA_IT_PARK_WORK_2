class Program {
	
	// a, b - parameters
	static void showInRange(int a, int b) {
		for (int i = a; i <= b; i++) {
			System.out.print(i + " ");
		}
	}
	
	static void swap(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
	}
	
	static void swapInArray(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void main(String args[]) {
		// 4, 7 - arguments
		showInRange(4, 7);
		int x = 5;
		int y = 10;
		// x, y - arguments
		showInRange(x, y);
		int p = 10;
		int u = 7;
		swap(p, u);
		System.out.println(p + " " + u);
		
		int t[] = {1, 2, 5, 6, 7};
		swapInArray(t, 3, 2);
		System.out.println(a[3] + " " + a[2]);
	}
}






