class Program {
	
	static void showLess(int array[], int number) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] < number) {
				System.out.println(array[i]);
			}
		}
	}
	public static void main(String[] args) {
		int a[] = {3, 6, 9, 2, 6};
		showLess(a, 4);
		
	}
}