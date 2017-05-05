class Program {
	public static void main(String args[]) {
		int n = 10;
		
		int i = n;
		
		// пока i больше 0	
		while (i >= 0) {
			// выводим i
			System.out.println(i);
			// уменьшаем на 1
			i = i - 1; // i -= 1; i--;
		}
	}
}