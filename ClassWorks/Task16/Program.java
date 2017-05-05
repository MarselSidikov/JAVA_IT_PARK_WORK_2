class Program {
	
	public static int maxNumber(int array[]) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			} 
		}	
		return max;
	}
	
	public static int minNumber(int array[]) {
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			} 
		}	
		return min;
	}
	
	public static void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static int find(int array[], int number) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				return i;
			}
		}
		return -1;
	}
	
	public static void swapMinMax(int array[]) {
		int min = minNumber(array);
		int max = maxNumber(array);
		int i = find(array, min);
		int j = find(array, max);
		swap(array, i, j);
	}
	
	public static void main(String[] args) {
		int a[] = {3, 5, 9, 2, 6};
		swapMinMax(a);
		for (int i = 0; i < 5; i++) {
				System.out.println(a[i]);
		}
	}
}
