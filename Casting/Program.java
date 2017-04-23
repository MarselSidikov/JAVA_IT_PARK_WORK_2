class Program {
	public static void main(String[] args) {
		int x = 7;
		int y = 2;

		int c = x / y; // 3

		double d = x / y; // d - 3.
		d = (x * 1.0) / y; // d  - 3.5

		// int r = d; // r - программа упадет
		int r = (int)d; // r = 3, остаток отбрасывается, явное преобразование

		byte b = 10;
		int i = b; 
		int z = 130;
		b = (byte)z; // -126

		System.out.println(b);
	}
}